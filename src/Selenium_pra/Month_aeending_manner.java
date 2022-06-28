package Selenium_pra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Month_aeending_manner {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		
		WebElement monthdropdown = driver.findElement(By.xpath("//select[@id='date_mon']"));
		
		Select s = new Select(monthdropdown);
		
	   List<WebElement> allelementinlistbox = s.getOptions();
	   
	   for(int i =0;i<allelementinlistbox.size();i++)
	   {
		   
		   System.out.println(allelementinlistbox.get(i).getText());
		  
	   }
		
	    System.out.println("*****************");
		
	    ArrayList<String> t = new ArrayList(allelementinlistbox);
	    
	    
	    ListIterator<String>  lt = t.listIterator();
	    
	   while(lt.hasNext())
	   {
		  
		   lt.next();
		   
	   }
	   
	   // System.out.println(lt);
	    
	    
//	    System.out.println(t);
//	    Collections.sort(t);
//	    
//	    System.out.println(t);
//	    
//	    for(int i =0;i<t.size();i++)
//	    {
//	    	
//	      System.out.println(t.get(i));
//	      	
//	    }
//		
	    driver.close();
	    
	}

}
