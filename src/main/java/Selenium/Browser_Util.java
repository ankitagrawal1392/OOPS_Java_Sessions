package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser_Util {
	
	
	WebDriver driver;
    
	public WebDriver intiDriver(String browserName) {
		
		
		System.out.println("browser name" + " " +browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
	    
		case "edge":
			driver = new EdgeDriver();
			break;
			
			
		case "safari":
			driver = new SafariDriver();
			break;
			
			
		default:
			System.out.println("Please pass the correct browser" + browserName);
			throw new BrowserException("==Invalid Browser==");
		}
		
		return driver;
		
	}
	
	public void launchUrl(String url) {
		System.out.println("Application url" + url);
		
		if(url==null) {
			throw new BrowserException("==invalid browserurl== url cannot be null");
		}
		if(url.indexOf("http") != 0) {
			throw new BrowserException("==invalid browser url== missing https");
		}
		
		driver.get(url);
		}
    
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
		
	
}
