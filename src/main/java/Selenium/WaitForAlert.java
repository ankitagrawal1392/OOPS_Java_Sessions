package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {
	
	static WebDriver driver;

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();

//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	
	    
		sendKeysInAlert(10,"Ankit");
		acceptAlert(10);
//		waitForAlert(10);
//		
//		System.out.println(getAlertText(10));
//		acceptAlert(10);
	}
	
	

	public static Alert waitForAlert(int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	
	public static String getAlertText(int Timeout) {
		return waitForAlert(Timeout).getText();
	}
	
	public static void acceptAlert(int Timeout) {
		 waitForAlert(Timeout).accept();
	}
	
	public static void dismissAlert(int Timeout) {
		 waitForAlert(Timeout).dismiss();;
	}
	
	public static void sendKeysInAlert(int timeout, String value) {
		 waitForAlert(timeout).sendKeys(value);
	}
}