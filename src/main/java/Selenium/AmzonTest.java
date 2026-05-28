package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonTest {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("Apple");
		
		Thread.sleep(3000);
		
		List<WebElement> search = driver.findElements(By.xpath("//div[@class='s-suggestion-container']/div[1]"));
		
	    List<String> searchList = new ArrayList<String>();
	    
		System.out.println(search.size());
		
		for(WebElement e : search) {
			String text = e.getText();
			if(text.length()!= 0) {
				searchList.add(text);
				if(searchList.contains("apple watch bands for women")) {
					e.click();
					break;
				}
				}
			
			
		
		}
		
	
		System.out.println(searchList);
	}

}
