package Advance_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hanlde_Multile_Webelement_1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		
		      List<WebElement> elements = driver.findElements(By.xpath("//a"));
		      
		      System.out.println(elements.size()); 
		      
		      for(int i = 0;i<elements.size();i++)
		      {
		    	  
		    	  System.out.println(elements.get(i).getText());
		    	  
		      }
		      
		      for(int i =0 ;i<elements.size();i++)
		      {
		    	  String expected = "Gmail";
		    	  String Actual = elements.get(i).getText();
		    	  
		    	  if(expected.equals(Actual))
		    	  {
		    		  elements.get(i).click();
		    		  break;
		    	  }
		    	  
		      }
		     System.out.println("Title of open window :- "+driver.getTitle());
		    Thread.sleep(5000);
		    driver.close();

	}

}
