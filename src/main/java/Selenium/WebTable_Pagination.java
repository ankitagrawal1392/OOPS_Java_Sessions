package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebTable_Pagination {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(9000);

		while (true) {
			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				selectCountry("India");
				break;
			} else {
				WebElement next = driver.findElement(By.cssSelector("button.next"));
				if (next.getDomAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over country is not found");
					break;
				}
				next.click();
				Thread.sleep(1000);
			}

		}

		/*
		 * while (true) { if
		 * (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
		 * selectMUltipleCountry("India");
		 * 
		 * } WebElement next = driver.findElement(By.cssSelector("Button.next")); if
		 * (next.getDomAttribute("class").contains("disabled")) {
		 * System.out.println("Pagination is over country is not found"); break; }
		 * next.click(); Thread.sleep(1000);
		 * 
		 * }
		 */

	}

	// multiselection

	public static void selectCountry(String countryName) {
		// driver.findElement(By.xpath("//td[text()='" + countryName
		// +"']/preceding-sibling::td/input[@type='checkbox']")) .click();

		WebElement ele = driver.findElement(By.xpath("//td[text()='" + countryName + "']"));

		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(ele)).click();
	}

	public static void selectMUltipleCountry(String countryName) {
		List<WebElement> checkbox = driver.findElements(
				By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"));
		for (WebElement e : checkbox) {
			e.click();
		}
	}

}
