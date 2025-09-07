package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAccessbilityTabSequence {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement firstName = driver.findElement(By.id("input-firstname"));
		;
		Actions act = new Actions(driver);
		
		act.sendKeys(firstName, "Ankit")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("Agrawal")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("ankit@gmail.com")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("78789798979")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("Selenium")
		.pause(500)
		.sendKeys(Keys.TAB)
		.sendKeys("Selenium")
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.SPACE).perform(); //checkbox
//		.pause(500)
//		.sendKeys(Keys.TAB)
//		.pause(500)
//		.sendKeys(Keys.ENTER)
//		.perform();
		
		

	}

}
