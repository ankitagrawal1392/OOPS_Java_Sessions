package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleBrowserHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		String parentWindowId = driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("OrangeHRM"))).click().perform(); 
		
		act.moveToElement(driver.findElement(By.linkText("CS & Support"))).click().perform(); 
		
		act.moveToElement(driver.findElement(By.linkText("Service Privacy Policy"))).click().perform(); 
		
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			
			String windowId = it.next();
			driver.switchTo().window(windowId);
			
			System.out.println(driver.getCurrentUrl()+ ":" + driver.getTitle());
			
			if(!windowId.equals(parentWindowId)) {
				driver.close();
			}
			
			
			Thread.sleep(2000);
		}
       
		
        
        
		
		
		

	}

}
