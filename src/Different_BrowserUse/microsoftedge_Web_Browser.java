package Different_BrowserUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class microsoftedge_Web_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        
	}

}
