package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Exception {

	static WebDriver driver;
		
	public static void main(String[] args) {
		
		
		
		    driver = new ChromeDriver();
		    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		    
//		     boolean flag = driver.findElement(By.id("input-email1")).isDisplayed();
//		     System.out.println(flag);
		     boolean flag1 = driver.findElement(By.id("input-email1")).isEnabled();
		     System.out.println(flag1);
		    
		    
//		    try {
//		    	driver.findElement(By.id("input-email1")).sendKeys("Tom@123");
//		    }
//		
//		    catch(NoSuchElementException e) {
//		    	System.out.println("No such element is found");
//		    	//e.printStackTrace();
//		    }
//		    
//		   String title =  driver.getTitle();
//		   System.out.println(title);

	}

}
