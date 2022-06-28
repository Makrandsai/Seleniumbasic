package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail_Advt_Handle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("chrome.driver.webdriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='login1']"));
	    Username.sendKeys("makrandtemkar2479");
		Thread.sleep(5000);
		
		WebElement Checkbox = driver.findElement(By.xpath("//span[@class='uncheck']"));
	    
		Checkbox.click();
        
		
        
		
		
	}

}
