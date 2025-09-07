package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoScoreCardWebTable {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/major-league-cricket-2025-1481991/los-angeles-knight-riders-vs-san-francisco-unicorns-30th-match-1482021/full-scorecard");
		Thread.sleep(4000);
		
		//String player = driver.findElement(By.xpath("(//span[text()='KL Rahul']/ancestor::td/following-sibling::td/span/span)[1]")).getText();
		//System.out.println(player);
		
		
		
		List<WebElement> scoreCard = driver.findElements(By.xpath("//span[text()='Andre Fletcher']/ancestor::td/following-sibling::td[contains(@class,'ds-min-w-max ds-text-right')]"));
		
		for(WebElement e : scoreCard) {
			
			String score = e.getText();
			System.out.println(score);
			
		}

	}

}
