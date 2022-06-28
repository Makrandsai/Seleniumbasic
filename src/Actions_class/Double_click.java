package Actions_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//https://demo.guru99.com/test/simple_context_menu.html
public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     driver.manage().window().maximize();
	     
	     
	     WebElement DoubleclickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	     
	     Actions at = new Actions(driver);
	     at.doubleClick(DoubleclickBtn).build().perform();
	     
	     Thread.sleep(5000);
	     Alert pop1 = driver.switchTo().alert();
	     pop1.accept();
	     Thread.sleep(5000);
	     
         driver.close();

	}

}
