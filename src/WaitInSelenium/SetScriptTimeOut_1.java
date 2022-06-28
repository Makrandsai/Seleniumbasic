package WaitInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetScriptTimeOut_1 {

	public static void main(String[] args) {
		
		
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://chercher.tech/practice/explicit-wait");
	       driver.manage().window().maximize();
	        

	}

}
