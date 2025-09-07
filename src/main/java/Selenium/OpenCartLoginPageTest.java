package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartLoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Browser_Util brUtil = new Browser_Util();
		
		WebDriver driver = brUtil.intiDriver("Chrome");
		
		
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = brUtil.getPageTitle();
		VerificationUtil.verify(title, "Account Login");
		
		
		By email =  By.id("input-email");
		By password =By.id("input-password");
		
		
		
		Element_Util eleUtil = new Element_Util(driver);
		
		eleUtil.getSendKeys(email, "Tom@gmail.com");
		eleUtil.getSendKeys(password, "Tom@123");
		
		
		
		

	}

}
