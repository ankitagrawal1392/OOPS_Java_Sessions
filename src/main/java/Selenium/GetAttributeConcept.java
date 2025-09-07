package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
		 String placeHoldervalue = driver.findElement(By.id("input-password")).getDomAttribute("placeholder");
		 
		 System.out.println(placeHoldervalue);
		 
		 String nameSpaceValue = driver.findElement(By.id("input-password")).getDomProperty("namespaceURI");
		    
		 System.out.println(nameSpaceValue);   
		    
		    

	}

}
