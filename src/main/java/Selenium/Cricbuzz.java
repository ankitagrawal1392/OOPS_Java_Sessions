package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/105770/eng-vs-ind-2nd-test-india-tour-of-england-2025");
		Thread.sleep(4000);
		
		//String wicketTaker = driver.findElement(By.xpath("//div[@id='innings_1']//a[text()=' Yashasvi Jaiswal ']/parent::div/following-sibling::div/span")).getText();
	
        //System.out.println(wicketTaker);
       
		getWicketTakerName(" Shubman Gill (c) ");
		
		List<String> NairScore =getScoreCardList(" Karun Nair ");
		System.out.println(NairScore);
		
        
		/*
		 * List<WebElement> scoreDetails = driver.findElements(By.
		 * xpath("//div[@id='innings_1']//a[text()=' Shubman Gill (c) ']/parent::div/following-sibling::div[contains(@class,'cb-col cb-col-8')]"
		 * ));
		 * 
		 * System.out.println(scoreDetails.size());
		 * 
		 * for(WebElement e :scoreDetails ) {
		 * 
		 * String text = e.getText(); System.out.println(text); }
		 */
		
		
      
       
	}
	
	public static String getWicketTakerName(String playername) {
		
		String wicketTaker = driver.findElement(By.xpath("//div[@id='innings_1']//a[text()='"+playername+"']/parent::div/following-sibling::div/span")).getText();
		System.out.println(wicketTaker);
		return wicketTaker; 
	}
	
	
	public static List<String> getScoreCardList(String playername) {
		List<WebElement> scoreDetails = driver.findElements(By.xpath("//div[@id='innings_1']//a[text()='"+playername+"']/parent::div/following-sibling::div[contains(@class,'cb-col cb-col-8')]"));
		
	       System.out.println(scoreDetails.size());
	       
	       List<String> score = new ArrayList<String>();
	       for(WebElement e :scoreDetails ) {
	    	   
	    	   String text = e.getText();
	    	   System.out.println(text);
	    	   score.add(text);
	       }
	       return score;
	}

}
