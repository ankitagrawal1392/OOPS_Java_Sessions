package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmXpathCss {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");

		driver.findElement(By.cssSelector("#Form_getForm_FullName")).sendKeys("ANKIT");
		// driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']"));

		driver.findElement(By.cssSelector(".text#Form_getForm_Contact")).sendKeys("7766868787");
		// driver.findElement(By.xpath("//input[@class='text'][@id='Form_getForm_Contact']")).sendKeys("65748586887");

		// driver.findElement(By.cssSelector(".navbar-brand.nav-logo")).click();

		driver.findElement(By.cssSelector("input[name='Email']#Form_getForm_Email")).sendKeys("abc@rdh.com");
		// driver.findElement(By.xpath("//input[@id='Form_getForm_Email'][@name='Email']")).sendKeys("xchh@ii.com");

		// Contains

		driver.findElement(By.cssSelector("input[name*='Job'][placeholder*='Title*'][required*=require]"))
				.sendKeys("Tester");

		// driver.findElement(By.xpath("//input[contains(@name,'Job')][contains(@placeholder,'Title')][contains(@class,'te')]")).sendKeys("Analyst");

		// starts-with"^" and endwith"$"
		driver.findElement(By.cssSelector("textarea[placeholder ^='Your']")).sendKeys("NA");
		driver.findElement(By.cssSelector("textarea[id$='Comment']")).sendKeys("NB");
		// driver.findElement(By.xpath("//textarea[starts-with(@placeholder,'Your')]")).sendKeys("NA");

		// Parent child

		// driver.findElements(By.cssSelector("footer a"));

		// driver.findElements(By.cssSelector("footer a")).size();
		System.out.println(driver.findElements(By.cssSelector("select#Form_getForm_Country>option")).size());

		// Indexing in css

		// select#Form_getForm_Country option:nth-child(odd)
		// select#Form_getForm_Country option:nth-child(even)
		// select#Form_getForm_Country option:nth-of-type(2)
		// select#Form_getForm_Country option:first-child
		// select#Form_getForm_Country option:last-child
		// select#Form_getForm_Country option:nth-last-child(3) last 3rd index

		// Xpath
		// select[@id='Form_getForm_Country']/option[position() mod 2 =1]

		int sizze = driver
				.findElements(By
						.cssSelector("input[id='Form_getForm_FullName'],[name='Contact'],[id='Form_getForm_JobTitle']"))
				.size();
		System.out.println(sizze);
	}

}
