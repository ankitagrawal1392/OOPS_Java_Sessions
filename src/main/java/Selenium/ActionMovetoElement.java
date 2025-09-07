package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMovetoElement {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(2000);
		
//		WebElement addons = driver.findElement(By.xpath("//div[text()='Add-ons']"));
//		
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(addons).perform();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("(//div[text()='Taxi'])[1]")).click();
//		
		By parentMenu = By.xpath("//div[text()='Add-ons']");
		By childMenu = By.xpath("(//div[text()='Taxi'])[1]");
		
		menuSubMenuHandling(parentMenu,childMenu);
	}
	
	
	public static void menuSubMenuHandling(By parentMenu,By childMenu) throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(2000);
		
		getElement(childMenu).click();
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
