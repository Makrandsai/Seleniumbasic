package ScrollPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.flipkart.com/");
	     driver.manage().window().maximize();
	     
	     
	     WebElement closepop = driver.findElement(By.xpath("//button[text() = '✕']"));
	     closepop.click();
	     JavascriptExecutor js  = ((JavascriptExecutor)driver);
	     
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		// js.executeScript("window.scrollBy(0,1000)");
		 
		 Thread.sleep(5000);
		WebElement mobilebtn = driver.findElement(By.xpath("//div[text() = 'Mobiles']"));
		js.executeScript("arguments[0].scrollIntoView();",mobilebtn );
		Thread.sleep(5000);
		//driver.close();
		
		
	}

}
