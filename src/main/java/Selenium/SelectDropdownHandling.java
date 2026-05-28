package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		By country = By.id("Form_getForm_Country");
		By employee = By.name("NoOfEmployees");
		
//		WebElement eleCountry = driver.findElement(country);
		WebElement eleemplyee = driver.findElement(employee);
//		
//		
//		Select selectCountry = new Select(eleCountry);
		Select selectEmployee = new Select(eleemplyee);
		 
//		
//		selectCountry.selectByIndex(2);
//		selectCountry.selectByValue("India");
//		selectEmployee.selectByVisibleText("51 - 200");
		
		
		//doSelectByIndex(country,6);
		doSelectByValue(country,"Sri Lanka");
		doSelectByVisibleText(employee,"51 - 200");
		
		
		WebElement cout =driver.findElement(By.cssSelector("select[id='Form_getForm_Country']"));

		Select selectCou = new Select(cout);
		selectCou.selectByIndex(0);
		
	}
	
	
	public static void doSelectByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);		
		
	}
	
	public static void doSelectByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	public static void doSelectByVisibleText(By locator,String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	

}
