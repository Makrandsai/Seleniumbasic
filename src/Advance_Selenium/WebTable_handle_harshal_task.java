package Advance_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable_handle_harshal_task {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	    WebElement MoreBSEButton = driver.findElement(By.xpath("//a[text()='More BSE Indices ']"));
	    MoreBSEButton.click();
	
	    Thread.sleep(2000);
	
	    WebElement ShowmoreButton = driver.findElement(By.xpath("//a[text()='Show More >>']"));
	    ShowmoreButton.click();
	
	    Thread.sleep(2000);
	    
	     List<WebElement> Tableallrow = driver.findElements(By.xpath("//table[@class='dataTable']"));
	     Thread.sleep(2000);
	     
	     
	     
	         for(int i =0 ;i<Tableallrow.size();i++)
	         {
	        	 
	        	 System.out.println(Tableallrow.get(i).getText());
	        	 
	         }
	       
List<WebElement> Tableallrow1 = driver.findElements(By.xpath("(//table[@class='dataTable']//tr[2])[1]"));     
	           System.out.println(Tableallrow1.get(0).getText());
            Thread.sleep(2000);
	         
	         driver.close();
	         
	         
	}

}
