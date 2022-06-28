package Selenium_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args, Object File) throws InterruptedException, FileNotFoundException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.facebook.com/");
        Driver.manage().window().maximize();
        
        Driver.findElement(By.cssSelector("#email")).sendKeys("makrandtemkart1333");
        
        Thread.sleep(2000);
        Driver.close();
        
     
      
        
	}

}
