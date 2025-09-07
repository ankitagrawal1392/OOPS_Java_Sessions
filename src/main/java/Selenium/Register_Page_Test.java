package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_Page_Test {

	public static void main(String[] args) {
		
		Browser_Util brUtil = new Browser_Util();
		WebDriver driver = brUtil.intiDriver("Chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
		By registerLink = By.linkText("Register");
		By fisrtName = By.id("input-firstname");
		
		By lastName = By.name("lastname");
		By email =By.xpath("//*[@id=\"input-email\"]");
		
		By telephone = By.cssSelector("#input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		
		By privacyCheckBox = By.name("agree");
		
		By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		
		By message = By.tagName("h1");
		
		Element_Util eleUtil = new Element_Util(driver);
		eleUtil.doClick(registerLink);
		eleUtil.getSendKeys(fisrtName, "Tom");
		eleUtil.getSendKeys(lastName, "Smith");
		eleUtil.getSendKeys(email, "tom@12418.com");
		eleUtil.getSendKeys(telephone, "758766868");
		eleUtil.getSendKeys(password, "Toommy");
		eleUtil.getSendKeys(confirmPassword, "Toommy");
		eleUtil.doClick(privacyCheckBox);
		eleUtil.doClick(continueButton);
		
		
		String msg = eleUtil.doelementgetText(message);
		
		if(msg.equals("Your Account Has Been Created!")) {
			System.out.println("Message " + msg );
		}
		else {
			System.out.println("Message " + msg );
		}
		
		
	}

}
