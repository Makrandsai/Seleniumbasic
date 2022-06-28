package WaitInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait__4 {

	public static void main(String[] args) {
		
		
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://chercher.tech/practice/explicit-wait");
	       driver.manage().window().maximize();
	       
	       WebElement btn4 = driver.findElement(By.xpath("//button[@id='enable-button']"));
	       btn4.click();
	       
	       WebElement buttonenable = driver.findElement(By.xpath("//button[@id='disable']"));
	       WebDriverWait w4 = new WebDriverWait(driver, 55);
	       w4.until(ExpectedConditions.elementToBeClickable(buttonenable));
	   //    driver.close();

	}

}
