package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Page_1 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.flipkart.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	     WebElement uptoaboutuslink = driver.findElement(By.xpath("//a[text() = 'Contact Us']"));
	     
	     JavascriptExecutor js = ((JavascriptExecutor)driver);
	     //js.executeScript("arguments[0].scrollIntoView();",uptoaboutuslink); // by using this we can scrool up to this element 
	     
	     
	     js.executeScript("window.scrollBy(0,2000)"); // 2000 is height of windwo ask to dev aslo we can 
	     Thread.sleep(8000);
	     //driver.close();
	     

	}

}
