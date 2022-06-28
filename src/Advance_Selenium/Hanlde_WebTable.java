package Advance_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hanlde_WebTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		driver.manage().window().maximize();
		 List<WebElement> coulmn = driver.findElements(By.xpath("//div[@class='hmmtctable']"));
		 List<WebElement> Rows = driver.findElements(By.xpath("//div[@class='hmmtctable']//ul"));
		 
		 List<WebElement> Row1 = driver.findElements(By.xpath("//div[@class='hmmtctable']//ul[2]//li"));
		 System.out.println(coulmn.size());
		 System.out.println(Rows.size());
		 
		 for(int i=0;i<Row1.size();i++)
		 {
			 System.out.println(Row1.get(i).getText());
		 }
		 
		 for(int i=0;i<coulmn.size();i++)
		 {
			 System.out.println(coulmn.get(i).getText());
		 }
          
		 Thread.sleep(4000);
		 driver.close();
	}

}
