package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);

		// driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

		/*
		 * List<WebElement> userInfoList = driver .findElements(By.xpath(
		 * "//a[text()='Joe.Root']/parent::td/following-sibling::td"));
		 * System.out.println(userInfoList.size());
		 * 
		 * for (WebElement e : userInfoList) { String text = e.getText();
		 * System.out.println(text);
		 * 
		 * }
		 */

		
		userInfo("Joe.Root");
		
		
		  
		  //selectUser("Joe.Root"); selectUser("Jasmine.Morgan");
		 

	}

	public static void selectUser(String username) {
		driver.findElement(
				By.xpath("//a[text()='" + username + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}
	
	
	public static List<String> userInfo(String username) {
		List <WebElement> userInfoList = driver.findElements(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td"));
		List<String> userInfo = new ArrayList<String>();
		System.out.println(userInfoList.size());

		for (WebElement e : userInfoList) {
			String text = e.getText();
			userInfo.add(text);
			System.out.println(text);
            
		}
		 return userInfo;
	}
}