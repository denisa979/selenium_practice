package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        if(pageSource.contains("Account Login")) {
            System.out.println("pass");
        }
    }
}
