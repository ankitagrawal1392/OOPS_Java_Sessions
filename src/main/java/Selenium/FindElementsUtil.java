package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		int totalLinks = getElementsCount(links);
		int totalImages= getElementsCount(images);
		
		System.out.println("Total Links " +totalLinks);
		System.out.println("Total Images " +totalImages);
		
		List<String> actualTextLinkList = getElementsTextLists(links);
		for(String e : actualTextLinkList) {
			System.out.println(e);
		}
		
		System.out.println(actualTextLinkList.size());
		
		
		List <String> expList = Arrays.asList("Login","Address Book","Login");
		if(actualTextLinkList.contains("My Account")) {
			System.out.println("Account is present");
		}

		if(actualTextLinkList.containsAll(expList)) {
			System.out.println("All the links are present");
		}
	}
	
	
	public static List<String> getElementsTextLists(By locator) {
		List<WebElement>  eleList = getElements(locator);
		
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String text = e.getText();
			if(text.length() != 0) {
				eleTextList.add(text);
				
			}
		}
		
		return eleTextList;
		
	}
	
	
	
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	

}
