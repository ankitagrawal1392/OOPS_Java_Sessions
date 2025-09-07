package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsingFindElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
        driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		List<WebElement> footerList = driver.findElements(By.xpath("//footer//a"));
//		
//		System.out.println(footerList.size());
//		
//		for(WebElement e : footerList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Contact Us")) {
//				e.click();
//				break;
//			}
//		}
		
		//By footerlinks = By.xpath("//footer//a");
		By leftPanelLinks =By.xpath("//div[@class='list-group']/a");
		//By leftPanelLinks =By.className("list-group-item");
		clickElement(leftPanelLinks,"Forgotten Password");
	}
	
	
	public static void clickElement(By locator,String eleText) {
		
       List<WebElement> footerList = driver.findElements(locator);
		
		System.out.println(footerList.size());
		
		for(WebElement e : footerList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(eleText)) {
				e.click();
				break;
			}
		}  
	}

}
