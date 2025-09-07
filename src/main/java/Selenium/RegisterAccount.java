package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccount {

	public static void main(String[] args) {
		
		
		Browser_Util brUtil = new Browser_Util();
		
		WebDriver driver = brUtil.intiDriver("Chrome");
		
		
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
     
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone =By.id("input-telephone");
		
		Element_Util eleUtil = new Element_Util(driver);
		
		eleUtil.getSendKeys(firstName, "Ankit");
		eleUtil.getSendKeys(lastName, "Agrawal");
		eleUtil.getSendKeys(email, "ankit21@yahoo.com");
		eleUtil.getSendKeys(telephone, "87878899889");
		
		
		//brUtil.quitBrowser();
		

	}
}
