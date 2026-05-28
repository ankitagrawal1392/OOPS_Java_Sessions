package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();

		Thread.sleep(4000);

		

		selectFutureDate("November 2026",32);

	}


 

	public static void selectDate(int date) {

		driver.findElement(By.xpath("//a[text()='" + date + "']")).click();
	}
	
	
	   public static void selectFutureDate(String ExpectedMonthYear,int date) {
		   
		   
		   if(date>31) {
			   System.out.println("Wrong Date passed" + date);
			   throw new RuntimeException("Invalid Date");
		   }
		   
			String ActualMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(ActualMonthYear);
			
			while(!ActualMonthYear.equalsIgnoreCase(ExpectedMonthYear)) {
				driver.findElement(By.cssSelector("a[title='Next']")).click();
				ActualMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			}
			
			selectDate(date);
		   
	   }
	  	

}