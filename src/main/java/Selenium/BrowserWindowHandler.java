package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowHandler {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("OrangeHRM"))).click().perform();
		
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		
		System.out.println("Parent Window id" +" " + parentWindowID);
		
		String childWindowID = it.next();
		
		System.out.println("Child Window id" + " " + childWindowID);
		
		
	 driver.switchTo().window(childWindowID);
	 
	 System.out.println("Child Window URL" + driver.getCurrentUrl());
	 driver.close();
	 
	 
	 driver.switchTo().window(parentWindowID);
	 
	 driver.findElement(By.id("Form_getForm_FullName")).sendKeys("abchjj");
	 
	 
		
		
		
		
		
		
		
		
		

	}

}
