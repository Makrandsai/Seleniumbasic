package Advance_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autosuggestion_Amazon {

	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		    
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.in/");
	       driver.manage().window().maximize();
	       
	       WebElement mainpagesearchtab = driver.findElement(By.xpath("//input[@name='field-keywords']"));
	       mainpagesearchtab.sendKeys("was");
	       Thread.sleep(2000);
	       List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']//div"));
	       
	       for(int i=0;i<autosuggestion.size();i++)
	       {
	    	   System.out.println(autosuggestion.get(i).getText());
	       }
	       
	      for(int i=0;i<autosuggestion.size();i++)
	    	  
	           {
	    	   String Expected = "washing machine cleaner";
	    	   String Actual = autosuggestion.get(i).getText();
	    	   if(Expected.equals(Actual))
	    	   {
	    		   autosuggestion.get(i).click();
	    		   break;
	    	   }
	       }
	       
	       System.out.println("Title of window"+driver.getTitle());
	       Thread.sleep(2000);
	       driver.close();

	}

}
