package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandleAssignment {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/contact-sales");

        String parentWindowId = driver.getWindowHandle();

        // Click and handle Facebook window
        handleNewWindow("//img[@alt='facebook logo']", parentWindowId, "Facebook");

        // Click and handle LinkedIn window
        handleNewWindow("//img[@alt='linkedin logo']", parentWindowId, "LinkedIn");

        // Click and handle YouTube window
        handleNewWindow("//img[@alt='youtube logo']", parentWindowId, "YouTube");

        // Back to parent window and do some action
        driver.switchTo().window(parentWindowId);
        driver.findElement(By.id("Form_getForm_FullName")).sendKeys("abchjj");

        driver.quit();
    }

    public static void handleNewWindow(String xpath, String parentId, String name) throws InterruptedException {
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath(xpath))).click().perform();

        Set<String> handles = driver.getWindowHandles();

        for (String windowId : handles) {
            if (!windowId.equals(parentId)) {
                driver.switchTo().window(windowId);
                System.out.println(name + " Window Title: " + driver.getTitle());
                driver.close();
                break;
            }
        }

        driver.switchTo().window(parentId);
    }
}