package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Element_Util {

	private WebDriver driver;

	public Element_Util(WebDriver driver) {
		this.driver = driver;
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void getSendKeys(By locator, String value) {
		if (value == null) {
			throw new ElementException("==Value cannot be null===");
		}
		getElement(locator).sendKeys(value);
	}

	public void doMultipleSendKeys(By locator, CharSequence... value) {
		getElement(locator).sendKeys(value);
	}

	public String doelementgetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		}

		catch (NoSuchElementException e) {
			System.out.println("Element is not displayed " + locator);
			return false;
		}
	}

	public boolean isElementEnabled(By locator) {
		try {
			return getElement(locator).isEnabled();
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed on the page: " + locator);
			return false;
		}
	}

	public String getElementDOMAttributeValue(By locator, String attrName) {
		return getElement(locator).getDomAttribute(attrName);
	}

	public String getElementDOMPropertValue(By locator, String propName) {
		return getElement(locator).getDomProperty(propName);
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public List<String> getElementsTextLists(By locator) {
		List<WebElement> eleList = getElements(locator);

		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);

			}
		}

		return eleTextList;

	}

	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public boolean isElementPresent(By locator) {

		if (getElementsCount(locator) == 1) {
			System.out.println("The element" + locator + "is present on page");
			return true;
		} else {
			System.out.println("The element" + locator + "is not present on page");
			return false;

		}

	}

	public boolean isElementPresent(By locator, int expElementCount) {

		if (getElementsCount(locator) == expElementCount) {
			System.out.println("The element" + locator + "is present on page");
			return true;
		} else {
			System.out.println("The element" + locator + "is not present on page");
			return false;

		}

	}

	public void clickElement(By locator, String eleText) {

		List<WebElement> footerList = getElements(locator);

		System.out.println(footerList.size());

		for (WebElement e : footerList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(eleText)) {
				e.click();
				break;
			}
		}
	}

	public void doSearch(By searchLocator, String searchkey, By suggestionLocator, String suggestionValue)
			throws InterruptedException {

		getSendKeys(searchLocator, searchkey);
		Thread.sleep(4000);

		List<WebElement> suggList = getElements(suggestionLocator);

		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(suggestionValue)) {
				e.click();
				break;
			}
		}
	}

	// --------------------Dropdown_Util-------

	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}

	public void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public void doSelectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}

	public List<String> getDropdownValueList(By locator) {

		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());

		List<String> optionValueList = new ArrayList<String>();

		for (WebElement e : optionsList) {
			String text = e.getText();
			optionValueList.add(text);
		}

		return optionValueList;

	}
	
	
	public void menuSubMenuHandlingLevel4(By menuLevel1,By menuLevel2,By menuLevel3,By menuLevel4) throws InterruptedException {
		
        Actions act = new Actions(driver);
		
		getElement(menuLevel1).click();
		
		Thread.sleep(2000);
		act.moveToElement(getElement(menuLevel2)).perform();
		
		Thread.sleep(2000);
		act.moveToElement(getElement(menuLevel3)).perform();
		Thread.sleep(2000);
		
		getElement(menuLevel4).click();
		
	}
	
	
	
///////-------------wait Utiliy------------/////


public  WebElement waitForElementPresent(By locator, int timeout) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

}

public WebElement waitForElementVisible(By locator, int timeout) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

}

}





