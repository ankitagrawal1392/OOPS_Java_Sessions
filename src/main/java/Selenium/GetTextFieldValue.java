package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//driver.findElement(By.id("input-email")).sendKeys("Ankit@43gmail.com");
		
		//String emailValue = driver.findElement(By.id("input-email")).getDomAttribute("value");
		//String emailValue = driver.findElement(By.id("input-email")).getDomProperty("value");
		//System.out.println(emailValue);
		
		By email = By.id("input-email");
		getElement(email).sendKeys("Ankit@43gmail.com");
		String text = getElementDOMPropertValue(email,"value");
		
		System.out.println(text);
		
		
	}
	
	
	public static String getElementDOMAttributeValue(By locator,String attrName) {
		return getElement(locator).getDomAttribute(attrName);
	}
	
   public static String getElementDOMPropertValue(By locator,String propName) {
	  return  getElement(locator).getDomProperty(propName);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
