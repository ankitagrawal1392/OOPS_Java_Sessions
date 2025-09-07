package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		
		//Create a WebElement(FE) + perform action(click, sendKeys, getText, isDiplayed)
		//1st Approach
		
		
		  //driver.findElement(By.id("input-email")).sendKeys("Tom@gmail.com");
		  //driver.findElement(By.id("input-password")).sendKeys("Tom@123");
		 
		
		//2nd Approaach we can use emailEle multiple times in scripts we dont have to create elements again and again
		
//		WebElement emailEle = driver.findElement(By.id("input-email"));
//		emailEle.sendKeys("Tom@gmail.com");
//		
//		WebElement passwordEle = driver.findElement(By.id("input-password"));
//		passwordEle.sendKeys("Tom@123");
		
		
		//3rd Approach By locaters we are not hitting the servers multiple times
		
//		 By email = By.id("input-email");
//		 By password = By.id("input-password");
//		 
//		 WebElement emailEle =  driver.findElement(email);
//		 WebElement passwordEle = driver.findElement(password);
//		 
//		 emailEle.sendKeys("Tom@gmail.com");
//		 passwordEle.sendKeys("Tom@123");
		
		
		//4th Approach By locators Util Method getElement
		
//		 By email = By.id("input-email");
//		 By password = By.id("input-password");
//		 
//		 getElement(email).sendKeys("Tom@gmail.com");
//		 getElement(password).sendKeys("Tom@123");
//		 
		
		//5th Approach  By locators Util Method getElement method and dosendkeys method
		
//		 By email = By.id("input-email");
//		 By password = By.id("input-password");
//		 
//		 doSendKeys(email,"Tom@gmail.com");
//		 doSendKeys(password,"Tom@123");
		
		
		 //6 th Approach By locators Util Method getElement method and dosendkeys method in ElementUTil
		 
		 By email = By.id("input-email");
		 By password = By.id("input-password");
		 
		 Element_Util eleUtil = new Element_Util(driver);
		 eleUtil.getSendKeys(email, "Tom@gmail.com");
		 eleUtil.getSendKeys(password, "Tom@123");
		 
		 
		 
		 
	}
	

}
