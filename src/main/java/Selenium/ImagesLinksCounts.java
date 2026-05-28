package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesLinksCounts {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();              

		driver.get("https://www.google.com");
		
		By links = By.tagName("a");
		
		
		List<String> actualLinkText=  getElementsTextList(links);
		System.out.println(actualLinkText);
		
/*		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksCount = links.size();
		
		for (int i = 0 ; i<linksCount; i++) {
			String text = links.get(i).getText();
			if(text.length()!=0) {
			System.out.println("Links text" + " " + text );
			}
		}
		
		System.out.println("====================");
		
		for(WebElement e :links ) {
			
			String text = e.getText();
			if(text.length()!=0) {
				System.out.println("Links text" + " " + text );
				}
		}*/
		
		
		
			
		

	}
	
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleText = new ArrayList<String>();
		
		for(WebElement e : eleList) {
			String text = e .getText();
			if (text.length() != 0) {
				eleText.add(text);
			}
		}
		
		return eleText;
		
		
		
		
	}
	
	public static List<WebElement> getElements(By locator) {
		  return driver.findElements(locator);
	}
}