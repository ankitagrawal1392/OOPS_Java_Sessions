package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		if(Title.equals("Google")) {
			System.out.println("Title is correct");
		}
			
		else {
			System.out.println("Title is incorrect");
		}
			
		driver.quit();
		//driver.close();
		
	

	}

}
