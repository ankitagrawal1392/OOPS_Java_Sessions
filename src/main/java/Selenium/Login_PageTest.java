package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Browser_Util ut = new Browser_Util();
		
		ut.intiDriver("Chrome");
		ut.launchUrl("https://www.facebook.com/");
		String title = ut.getPageTitle();
		
		VerificationUtil.verify(title, "Facebook – log in or sign up");
		
		String url = ut.getCurrentURL();
		VerificationUtil.verifyContains(url, "facebook");
		
		ut.closeBrowser();
		
			

		

	}

}
