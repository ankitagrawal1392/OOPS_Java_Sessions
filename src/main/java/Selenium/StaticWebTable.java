package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		/*
		 * //table[@id='customers']//tr[2]/td[1]
		 * 
		 * String beforeXpath="//table[@id='customers']//tr["; String
		 * afterXpath="]/td[1]";
		 * 
		 * int rowcount =
		 * driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		 * 
		 * for(int row = 2;row<=rowcount;row++) { String finalpath = beforeXpath + row +
		 * afterXpath;
		 * 
		 * String text = driver.findElement(By.xpath(finalpath)).getText();
		 * System.out.println(text); }
		 */
		
		getTableData(1);
		getTableData(2);
		getTableData(3);
		
	}

	public static void getTableData(int columnNumber) {
		
		String beforeXpath="//table[@id='customers']//tr[";
		String afterXpath="]/td["+columnNumber+"]";
		
		int rowcount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		for(int row = 2;row<=rowcount;row++) {
			String finalpath = beforeXpath + row + afterXpath;
			
			String text = driver.findElement(By.xpath(finalpath)).getText();
			System.out.println(text);
		}
		
	}
}
