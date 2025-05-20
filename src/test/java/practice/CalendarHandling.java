package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        driver.findElement(By.id("datepicker")).click();

        // selectDate("15");

        selectFutureDate("August 2025", 15);// August 2025

    }

    public static void selectFutureDate(String expMonthYear, int date) {

        if (expMonthYear.contains("February") && date > 29) {
            System.out.println("wrong date is passed, plz pass the date bw 1 to 29 for Feb Month.." + date);
            throw new RuntimeException("Invalid Date");
        }

        if (date > 31) {
            System.out.println("wrong date is passed, plz pass the date bw 1 to 31.." + date);
            throw new RuntimeException("Invalid Date");
        }
        if (date <= 0) {
            System.out.println("wrong date is passed, plz pass the date bw 1 to 31.." + date);
            throw new RuntimeException("Invalid Date");
        }

        String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
        System.out.println(actMonthYear); // March 2025

        while (!actMonthYear.equalsIgnoreCase(expMonthYear)) {
            // click on next arrow/icon
            driver.findElement(By.xpath("//span[text()='Next']")).click();
            actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
        }

        selectDate(date);

    }

    public static void selectDate(int date) {
        try {
            driver.findElement(By.xpath("//a[text()='" + date + "']")).click();
        } catch (NoSuchElementException e) {
            System.out.println("wrong date is passed for this month " + date);

        }
    }
}
