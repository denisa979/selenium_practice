package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AccessibilityTesting {
    
    static WebDriver driver;

    public static void main(String[] args) {
        
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
      WebElement firstName = driver.findElement(By.id("input-firstname"));
        
        Actions act = new Actions(driver);
      Action action = act.sendKeys(firstName, "Denisa")
                .sendKeys(Keys.TAB)
                .pause(500)
                .sendKeys("Mutapcic")
                .sendKeys(Keys.TAB)
                .pause(500)
                .sendKeys("dmutapcic@hotmail.com")
                .sendKeys(Keys.TAB)
                .pause(500)
                .sendKeys("1234567899")
                .sendKeys(Keys.TAB)
                .pause(500)
                .sendKeys("denisa@123")
                .sendKeys(Keys.TAB)
                .pause(500)
                .sendKeys("denisa@123")
                .sendKeys(Keys.TAB)
                .pause(500)
                .sendKeys(Keys.TAB)
                .pause(500)
                .sendKeys(Keys.TAB)
                .pause(500)
                .sendKeys(Keys.SPACE)
                .pause(500)
                .sendKeys(Keys.ENTER)
              .build();
              action.perform();
    }
}
