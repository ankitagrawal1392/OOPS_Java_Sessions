package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		
		By country = By.id("Form_getForm_Country");

//		WebElement eleCountry = driver.findElement(country);
//		
//		Select select = new Select(eleCountry);
//		 
//		List<WebElement> optionsList = select.getOptions();
//		System.out.println("Total Countries " + optionsList.size() );
//		
//		for(WebElement e : optionsList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		
		List <String> countryList = getDropdownValueList(country);
		System.out.println(countryList);
		
		if(countryList.containsAll(Arrays.asList("India","Sri Lanka","Nepal"))) {
			System.out.println("All values are present");
		}
		
		
	}
	
	
	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	
	public static List<String> getDropdownValueList(By locator) {
		
		Select select = new Select(getElement(locator)) ;
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		
		List<String> optionValueList = new ArrayList<String>();
		
		for(WebElement e : optionsList) {
		   String text = e.getText();
		   optionValueList.add(text);
		}
		
		return optionValueList;
		
	}
	
	public static WebElement  getElement(By locator) {
		return driver.findElement(locator);
	}

}
