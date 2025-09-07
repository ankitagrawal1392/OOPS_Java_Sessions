package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeHandle {

	public static void main(String[] args) {
    
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-scenario/");//page
		
		driver.switchTo().frame("pact1");
		
		driver.findElement(By.id("inp_val")).sendKeys("Selenium");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Automation");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Testing");
		
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys(" Playright");
		
		
		driver.switchTo().defaultContent();
		String header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
		
		driver.switchTo().frame("pact1");
		String imag = driver.findElement(By.xpath("//h3[text()='Dare for you']")).getText();
		System.out.println(imag);
		
	}

}
