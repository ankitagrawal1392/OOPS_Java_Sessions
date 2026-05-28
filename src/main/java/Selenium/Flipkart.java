package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Flipkart {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		
		
		driver.findElement(By.name("q")).sendKeys("Prestige");
		
		Thread.sleep(3000);
		
		List<WebElement> search = driver.findElements(By.xpath("//ul/li//a//div[2]"));
		
		System.out.println(search.size());
		
		for(WebElement e : search) {
			String text = e.getText();
			System.out.println(text);
		}

	}

}
