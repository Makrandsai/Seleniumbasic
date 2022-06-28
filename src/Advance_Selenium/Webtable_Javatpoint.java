package Advance_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Javatpoint {

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.javatpoint.com/list-vs-arraylist-in-java");
	       driver.manage().window().maximize();
	       
	       
	     List<WebElement> Differenecetable = driver.findElements(By.xpath("//table[@class='alt']"));
	     
	     for(int i =0 ;i<Differenecetable.size();i++)
	     {
	    	 
	    	 System.out.println(Differenecetable.get(i).getText());
	    	 
	     }
	       Thread.sleep(5000);
            driver.close();
	}

}
