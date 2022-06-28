package WaitInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout_2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(55, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        
        
        
	}

}
