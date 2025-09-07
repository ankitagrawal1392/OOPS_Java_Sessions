package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
        driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com"); 
		
		//By searchLocator = By.name("q");
		By searchLocator = By.name("field-keywords");
		//By suggestionLocator = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
		By suggestionLocator = By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']");
		
		doSearch(searchLocator,"Apple",suggestionLocator,"airpods");
		
//		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
//		Thread.sleep(4000);
//		
//		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
//		
//		
//		
//		System.out.println(suggList.size());
//		
//		for(WebElement e :suggList ) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("framework")) {
//				e.click();
//				break;
//			}
//		}
		
	}
	
	public static void doSearch(By searchLocator,String searchkey,By suggestionLocator,String suggestionValue) throws InterruptedException {
		
		Thread.sleep(8000);
		driver.findElement(searchLocator).sendKeys(searchkey);
		Thread.sleep(4000);
		
		List<WebElement> suggList = driver.findElements(suggestionLocator);
		
		System.out.println(suggList.size());
		
		for(WebElement e :suggList ) {
			String text = e.getText();
		System.out.println(text);
			if(text.contains(suggestionValue)) {
				e.click();
				break;
			}
		}
	}

}
