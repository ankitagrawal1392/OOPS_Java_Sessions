package Selenium;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Java_Streams {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> prices = driver.findElements(By.cssSelector(".inventory_item_price"));
		
		//prices.stream().forEach(e -> System.out.println(e.getText()));
		
		//prices.stream().map(e -> Double.parseDouble(e.getText().substring(1))).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		List<Double> price_Desc_Order =prices.stream().map(e -> Double.parseDouble(e.getText().substring(1))).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(price_Desc_Order);
		
		//prices.stream().map(e -> Double.parseDouble(e.getText().substring(1))).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       
		System.out.println("Max price" + price_Desc_Order.get(0));
		System.out.println("Min price" +price_Desc_Order.get(price_Desc_Order.size()-1));
	}

}
