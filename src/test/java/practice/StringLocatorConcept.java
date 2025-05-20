package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringLocatorConcept {
    
         static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();// 123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String email_id = "input-email";
		String password_id = "input-password";
		String login_btn_xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input";
		
		//7th : String locator
//		doSendKeys(getLocator("ID", email_id), "denisa@gmail.com");
//		doSendKeys(getLocator("ID", password_id), "denisa@123");
//		doClick(getLocator("XPATH", login_btn_xpath));
		
		//8th: String locator
		doSendKeys("ID", email_id, "denisa@gmail.com");
		doSendKeys("ID", password_id, "denisa@123");
		doClick("XPATH", login_btn_xpath);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doClick(String locatorType, String locatorValue) {
		getElement(getLocator(locatorType, locatorValue)).click();
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(getLocator(locatorType, locatorValue)).sendKeys(value);
	}
	

	public static By getLocator(String locatorType, String locatorValue) {

		By locator = null;

		switch (locatorType.toUpperCase().trim()) {
		case "ID":
			locator = By.id(locatorValue);
			break;
		case "NAME":
			locator = By.name(locatorValue);
			break;
		case "CLASSNAME":
			locator = By.className(locatorValue);
			break;
		case "XPATH":
			locator = By.xpath(locatorValue);
			break;
		case "CSS":
			locator = By.cssSelector(locatorValue);
			break;
		case "LINKTEXT":
			locator = By.linkText(locatorValue);
			break;
		case "PARTIALLINKTEXT":
			locator = By.partialLinkText(locatorValue);
			break;
		case "TAGNAME":
			locator = By.tagName(locatorValue);
			break;

		default:
			System.out.println("invalid locator, please use the right locator...");
			break;
		}

		return locator;

	}

}
