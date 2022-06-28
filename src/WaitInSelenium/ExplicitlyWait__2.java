package WaitInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait__2 {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://chercher.tech/practice/explicit-wait");
	       driver.manage().window().maximize();
	       
	       
	       WebElement btn2 = driver.findElement(By.xpath("//button[@id='populate-text']"));
	       btn2.click();
	       
	       WebElement lablechange = driver.findElement(By.xpath("//h2[@id='h2']"));
	       WebDriverWait w2 = new WebDriverWait(driver, 50);
	       w2.until(ExpectedConditions.textToBePresentInElement(lablechange, "Selenium Webdriver"));
            
	       driver.close();
	}

}
