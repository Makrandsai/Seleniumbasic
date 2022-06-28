package Iframe;

import java.util.Enumeration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		
		WebElement HomeIcon = driver.findElement(By.xpath("//a[@id= 'tryhome']"));
		 
		
		  // driver.switchTo().frame("iframeResult");
		  // driver.switchTo().frame(0);
		
		  WebElement iframexpath = driver.findElement(By.xpath("//iframe[@id= 'iframeResult']"));
		  driver.switchTo().frame(iframexpath);
		  WebElement iframe1 = driver.findElement(By.xpath("//button[@type= 'button']"));
		 
		  
		  
		  iframe1.click();
		
		 // HomeIcon.click();
		 Thread.sleep(4000);
		
		 driver.close();
		
		
	}

}
