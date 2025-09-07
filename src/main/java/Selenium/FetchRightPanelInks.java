package Selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchRightPanelInks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By rightPanelLinks = By.className("list-group-item");
		
//		List<WebElement> rightPanelLinksList = driver.findElements(rightPanelLinks);
//		System.out.println(rightPanelLinksList.size());
//		
//		for(WebElement e : rightPanelLinksList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		
		
		Element_Util eleUtil = new Element_Util(driver);
		
		int actLinksCount = eleUtil.getElementsCount(rightPanelLinks);
		if(actLinksCount == 13) {
			System.out.println("Pass");
		}
		
		List<String> actLinkText = eleUtil.getElementsTextLists(rightPanelLinks);
		
		if(actLinkText.containsAll(Arrays.asList("Login", "Forgotten Password", "Register")));{
			System.out.println("All important links are present");
		}
		
	}

}
