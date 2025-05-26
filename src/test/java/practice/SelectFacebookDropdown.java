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
            elementUtil.sendKeys(name, "denisa");
           
            By lastName = By.xpath("//input[@name='lastname']");
            elementUtil.sendKeys(lastName, "mirkovic");
            
            By month = By.id("month");
            elementUtil.sendKeys(month, "7");
            
            By day = By.id("day");
            elementUtil.sendKeys(day, "03");
            
            By year = By.id("year");
            elementUtil.sendKeys(year, "1979");
            
            By female = By.xpath("//input[@type='radio']");
             elementUtil.click(female);
             
            By male = By.xpath("(//input[@type='radio'])[2]");
          
            By custom = By.xpath("(//input[@type='radio'])[3]");
            
            By mobil = By.xpath("(//input[@type='text'])[5]");
             elementUtil.sendKeys(mobil,"555-555-5555");
             
            By password = By.xpath("//input[@type='password']");
            elementUtil.sendKeys(password, "denisa123");
                             
            By submitBtn = By.xpath("//button[@type='submit']");
            elementUtil.click(submitBtn);
                             
            By header = By.xpath("//div[@class='pvl _52lp']/div");
            String headerText = elementUtil.getText(header);
            System.out.println("headerText = " + headerText);

    }
}
