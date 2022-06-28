package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Mouce_Over1 {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.amazon.com/");
	     driver.manage().window().maximize();
	     
	   WebElement linkofoptions = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	   
	   Actions a = new Actions(driver);
	   a.moveToElement(linkofoptions).build().perform();
	     
	    Thread.sleep(3000);
	    WebElement browsingHistoryBtn = driver.findElement(By.xpath("//span[text() ='Browsing History']"));
	    browsingHistoryBtn.click();
	     
	    Thread.sleep(8000);
	     
	     
	    driver.close();
	     
	   
	}

}
