package Different_BrowserUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Operamini_webBrowser_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver","operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        
        

	}

}
