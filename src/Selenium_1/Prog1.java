package Selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver = new ChromeDriver();

Thread.sleep(12);
driver.manage().window().maximize();

Thread.sleep(2000);
driver.get("https://is.rediff.com/signup/register");

Thread.sleep(2000);
driver.navigate().to("https://www.google.com/");

Thread.sleep(2000);
driver.navigate().to("https://www.facebook.com/");

Thread.sleep(2000);
driver.navigate().back();

Thread.sleep(2000);
driver.navigate().forward();

Thread.sleep(2000);
driver.navigate().refresh();

Thread.sleep(2000);
driver.close();
}
}