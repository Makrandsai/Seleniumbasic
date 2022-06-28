package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoucOver_and_Click {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.americangolf.com/#");
	     driver.manage().window().maximize();
	     
	     WebElement aboutUslink = driver.findElement(By.xpath("//a[text() ='About Us']"));
	     
	     Actions a = new Actions(driver);
	     a.moveToElement(aboutUslink).build().perform();
	     Thread.sleep(3000);
	     WebElement AmerciangolfFoudation = driver.findElement(By.xpath("(//a[@title='American Golf Foundation'])[1]"));
	     AmerciangolfFoudation.click();
	     Thread.sleep(3000);
	 
	     driver.close();

	}

}
