package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// 
		//System.out.println(0/0);
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//input[@class='Pke_EE' and contains(@name,'q') ]")).sendKeys("fossil");
		
		Thread.sleep(4000);
		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']"));
		
		System.out.println(suggList.size());
		
		for(WebElement e : suggList ) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("digital")) {
				e.click();
				break;
			}
			
		}

	}

}

