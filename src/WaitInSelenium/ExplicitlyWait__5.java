package WaitInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait__5 {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://chercher.tech/practice/explicit-wait");
	       driver.manage().window().maximize();
	       
	       
	       WebElement btn5 = driver.findElement(By.xpath("//button[@id='checkbox']"));
	       btn5.click();
	       
	        WebElement tickchcekbox = driver.findElement(By.xpath("//input[@id='ch']"));
	        WebDriverWait w5 = new WebDriverWait(driver, 55);
	        w5.until(ExpectedConditions.elementToBeClickable(tickchcekbox));
	        
	        driver.close();

	}

}
