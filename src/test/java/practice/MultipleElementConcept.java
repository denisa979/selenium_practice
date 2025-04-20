package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class MultipleElementConcept {

    static WebDriver driver;
    public static void main(String[] args) {

        driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        for (WebElement e : allLinks){

        }

        driver.quit();
    }

}
