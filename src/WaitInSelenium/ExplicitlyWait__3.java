package WaitInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait__3 {

	public static void main(String[] args) {
		
		
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://chercher.tech/practice/explicit-wait");
	       driver.manage().window().maximize();
	       
	       
	       WebElement btn3 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
	       btn3.click();
	       
	       WebElement enablebtn = driver.findElement(By.xpath("//button[@id='hidden']"));
		   
	       WebDriverWait w3 = new WebDriverWait(driver, 50);
	       w3.until(ExpectedConditions.visibilityOfAllElements(enablebtn));
	       
	       driver.close();

	}

}
