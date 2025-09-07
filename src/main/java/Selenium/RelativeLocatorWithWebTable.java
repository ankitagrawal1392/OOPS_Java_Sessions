package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorWithWebTable {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement userNameElement = driver.findElement(By.linkText("Joe.Root"));
		
		      String abovePlayer =  driver.findElement(RelativeLocator.with(By.tagName("a")).above(userNameElement)).getText();
		      System.out.println(abovePlayer);
		
		      
		      String belowPlayer = driver.findElement(RelativeLocator.with(By.tagName("a")).below(userNameElement)).getText();
		      System.out.println(belowPlayer);
		      
		      
		      driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).toLeftOf(userNameElement)).click();
		      
		     String role =  driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(userNameElement)).getText();
		     System.out.println(role);
		     
		     
		     
		    String user = driver.findElement(RelativeLocator.with(By.tagName("a")).near(userNameElement)).getText();
		    System.out.println(user);
	}
	
	
	
	
}
