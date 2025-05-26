package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ElementUtil;
public class SelectFacebookDropdown {
       static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/r.php?entry_point=login");
            ElementUtil elementUtil = new ElementUtil(driver);
            By name = By.xpath("//input[@name='firstname']");
            By lastName = By.xpath("//input[@name='lastname']");
            By month = By.id("month");
            By day = By.id("day");
            By year = By.id("year");
            By female = By.xpath("//input[@type='radio']");
            By male = By.xpath("(//input[@type='radio'])[2]");
            By custom = By.xpath("(//input[@type='radio'])[3]");
            By mobil = By.xpath("(//input[@type='text'])[5]");
            By password = By.xpath("//input[@type='password']");
            By submitBtn = By.xpath("//button[@type='submit']");
            By header = By.xpath("//div[@class='pvl _52lp']/div");
            String headerText = elementUtil.getText(header);
            System.out.println("headerText = " + headerText);
            By message = By.className("_9bq5");
            String messageText = elementUtil.getText(message);
            System.out.println("message = " + message);
            elementUtil.sendKeys(lastName, "mirkovic");
            elementUtil.sendKeys(name, "denisa");
            elementUtil.sendKeys(month, "7");
            elementUtil.sendKeys(day, "03");
            elementUtil.sendKeys(year, "1979");
            elementUtil.sendKeys(mobil,"555-555-5555");
            elementUtil.sendKeys(password, "denisa123");
            elementUtil.click(submitBtn);
    }
}
