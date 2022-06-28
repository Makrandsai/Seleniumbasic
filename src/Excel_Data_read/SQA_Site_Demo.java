package Excel_Data_read;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SQA_Site_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		
        WebElement Search1 = driver.findElement(By.xpath("(//input[@placeholder ='Search...'])[1]")) ;
	
	
	    Search1.sendKeys("Retesting");
	    Thread.sleep(4000);
	 //   driver.close();
	
	
	
	
	
	
	
	}
	
	
	
	

}
