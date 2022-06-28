package WaitInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait__1 {

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://chercher.tech/practice/explicit-wait");
	       driver.manage().window().maximize();
     
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='alert']"));
		btn1.click();
		
		WebDriverWait w1 = new WebDriverWait(driver, 1500);
		w1.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(5000);
	   
		 Alert a = driver.switchTo().alert();
		 
		driver.switchTo().alert().dismiss();
		
		
		driver.close();
		
		
	
		
		
	}

}
