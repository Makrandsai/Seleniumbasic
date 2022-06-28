package Advance_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Multiple_Elements_2 {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
            List<WebElement> links = driver.findElements(By.xpath("//a"));
            System.out.println(links.size());
   // this for loop for print the links which prenent under "a" tagname
          for(int i = 0 ; i <links.size();i++)
          {
                      System.out.println(links.get(i).getText());
          }
    //this is used for click the any link present under thw tagname a      
          for(int i = 0 ; i <links.size();i++)
          {
        	  String expected ="Voting Information Centre";
        	  String Actual = links.get(i).getText();
        	  
        	  if(Actual.equals(expected)) // it comapre the actual link text with expected 
        	  {
        		  links.get(i).click();
        		  break;
        	  }
          }
          
          Thread.sleep(5000);
          
          System.out.println("title of window :- "+driver.getTitle());
          System.out.println(driver.getCurrentUrl());
          
          driver.close();
        	  
	}

}
