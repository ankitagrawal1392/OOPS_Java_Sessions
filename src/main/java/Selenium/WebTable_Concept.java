package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Concept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//td/a[text()= 'Garry.White']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		List<WebElement> data = driver.findElements(By.xpath("//td/a[text()= 'Jasmine.Morgan']/parent::td/following-sibling::td"));
		
		List<String> Values = new ArrayList<String>();
		
		for(WebElement e : data) {
			String value = e.getText();
			if(value.length()>0) {
				Values.add(value);
			}
		}
		
		System.out.println(Values.size());
	}

}
