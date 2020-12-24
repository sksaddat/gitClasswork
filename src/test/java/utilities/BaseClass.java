package utilities;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
public static void openBrowser() {
System.setProperty("webdriver.chrome.driver","/Users/salwasaddat/Desktop/Desktop/Selenium/chromedriver");
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
driver.get("https://login.salesforce.com");

}
}
