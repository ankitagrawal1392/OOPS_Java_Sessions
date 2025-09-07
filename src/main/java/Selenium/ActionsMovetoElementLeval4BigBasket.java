package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class ActionsMovetoElementLeval4BigBasket {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		
		By menuLevel1 = By.xpath("(//span[text()='Category'])[2]");
		
		By menuLevel2 = By.linkText("Electronics");
		By menuLevel3 = By.linkText("Beauty & Grooming");
		By menuLevel4 = By.linkText("Body Massagers");
		
		
		Actions act = new Actions(driver);
		
		driver.findElement(menuLevel1).click();
		
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(menuLevel2)).perform();
		
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(menuLevel3)).perform();
		Thread.sleep(2000);
		
		driver.findElement(menuLevel4).click();
		
		
		
		
		
	}

}
