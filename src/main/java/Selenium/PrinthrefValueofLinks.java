package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrinthrefValueofLinks {

	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
		 
		List <WebElement> linkLists =  driver.findElements(By.tagName("a"));
		
		for(WebElement e :linkLists ) {
			
		String hrefValue = e.getDomAttribute("href");
		String text = e.getText();
		System.out.println(text + ":::" + hrefValue );
		}
		
	}

}
