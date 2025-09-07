package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emailId = By.id("input-email");
		By password = By.id("input-password2");
		By loginBtn = By.xpath("//input[@value='Login']");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement emailEle = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//
//		emailEle.sendKeys("Ankit@123gmail.com");
//
//		driver.findElement(password).sendKeys("Ankit@123");
//
//		driver.findElement(loginBtn).click();
		
		waitForElementPresent(emailId,5).sendKeys("Ankit@gmail.com");
		waitForElementVisible(password,5).sendKeys("jhj@45");
		driver.findElement(loginBtn).click();
	}

	public static WebElement waitForElementPresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

}
