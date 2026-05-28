package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_Orange {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		
	}
}
