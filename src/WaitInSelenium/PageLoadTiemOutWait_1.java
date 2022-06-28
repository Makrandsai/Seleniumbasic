package WaitInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTiemOutWait_1 {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
	       driver.get("https://www.amazon.in/");
	      
	       driver.close();
	       
	}

}
