package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutSelectClass {
	
	
 static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		By country = By.cssSelector("#Form_getForm_Country>option");
		
		List<WebElement> eleCountry = driver.findElements(country);
		
		
		for(WebElement e : eleCountry ) {
		String text = e.getText();
			if(text.contains("India")) {
				e.click();
			}
		}
		
	   
		
		

	}

}
