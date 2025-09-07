package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
//		String URL=  js.executeScript("return document.URL").toString();
//		System.out.println(URL);
//		
//		js.executeScript("history.go(0)");
//		js.executeScript("history.go(-1)");
//		js.executeScript("history.go(1)");
		
//		js.executeScript("alert('this')");
//		Thread.sleep(5000);
//		driver.switchTo().alert().accept();
		
//		String text = js.executeScript("return document.documentElement.innerText").toString();
//		System.out.println(text);
		
		
		//js.executeScript("window.scrollTo(0,document.body.scrollheight)");
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");

	}

}
