package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouce_Over_FlipCard {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.flipkart.com/");
	     driver.manage().window().maximize();
	     
	     Thread.sleep(2000);
         WebElement closethepopup = driver.findElement(By.xpath("//button[text() ='✕']")) ;
         closethepopup.click();
         Thread.sleep(2000);
	     WebElement loginbtn = driver.findElement(By.xpath("//a[text() = 'Login']"));
	     
	     Actions a = new Actions(driver);
	     a.moveToElement(loginbtn).build().perform();
	    
	   
	     
	    WebElement orderlink = driver.findElement(By.xpath("//div[text() = 'Wishlist']"));
	    
	    orderlink.click();
	    
	    Thread.sleep(3000);
	    driver.close();
	    
	}

}
