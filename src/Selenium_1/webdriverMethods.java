package Selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverMethods {
public static void main(String [] args) {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.rediff.com/");

}
}