package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementisDisplayed {

	static WebDriver driver;
	
	public static void main(String[] args) {
		 
		driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		boolean flag = driver.findElement(By.id("input-email1")).isDisplayed();
//		System.out.println(flag);
	    
	    By email = By.id("input-email34");
	    boolean flag = isElementDisplayed(email);
	    System.out.println(flag);
	    
	    System.out.println(driver.getTitle());
		

	}
	
	public static boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		}
		
		catch(NoSuchElementException e) {
			System.out.println("Element is not displayed " + locator );
			return false;
		}
		  
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
