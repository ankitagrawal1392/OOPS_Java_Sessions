package Selenium;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class JavaStreams {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();
	    
	    
	    List<WebElement> price = driver.findElements(By.className("inventory_item_price"));
	    
	    price.stream().forEach(e ->  System.out.println(e.getText()));
	    
	    List<Double> prices_Desce_order = price.stream().map(e -> Double.parseDouble(e.getText().substring(1))).sorted().collect(Collectors.toList());
	    
	   
	    System.out.println(prices_Desce_order);
	}

	
}
