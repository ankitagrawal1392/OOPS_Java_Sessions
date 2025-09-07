package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsPresent {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		List<WebElement> eleList = driver.findElements(By.id("input-email"));
//		
//	    if(eleList.size()==1) {
//	    	System.out.println("element is present on page");
//	    }
//	    
//	    else {
//	    	System.out.println("element is not present on page");
//
//	    }
		
		By email = By.id("input-email1");
		
		if(isElementPresent(email)) {
			System.out.println("PASS");
		}
		
		if(isElementPresent(email,1)) {
			System.out.println("PASS");
		}
	}
	
	
	
	
	
	public static boolean isElementPresent(By locator) {
		
	   if(driver.findElements(locator).size()==1) {
		   System.out.println("The element" + locator + "is present on page");
		   return true;
	   }
	   else {
		   System.out.println("The element" + locator + "is not present on page");
		   return false;

	    }
	   
		   
	}
	
	
	public static boolean isElementPresent(By locator,int expElementCount) {
		
	   if(driver.findElements(locator).size()==expElementCount) {
		   System.out.println("The element" + locator + "is present on page");
		   return true;
	   }
	   else {
		   System.out.println("The element" + locator + "is not present on page");
		   return false;

	    }
	   
		   
	}
	
	
	

}
 