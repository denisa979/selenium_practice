package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
    private WebDriver driver;
    public ElementUtil(WebDriver driver){
        this.driver=driver;
    }
          public  void sendKeys(By locator, String value){
         getElement(locator).sendKeys(value);  
    }
    public  void click(By locator){
            getElement(locator).click();
    }
    public  void select(By locator){
            getElement(locator).isSelected();
    }
    public WebElement getElement(By locator) {
           return driver.findElement(locator); 
    }
    public String getText(By locator){
       return getElement(locator).getText();
    }
}
