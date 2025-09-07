package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		
		     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
		     
		     List<WebElement> langList =   driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction']/span"));
		     
		   //List<WebElement> langList =   driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		   
		   System.out.println(langList.size());
		   
		   for(WebElement e : langList) {
			   System.out.println(e.getText());
		   }
	}

	
}
