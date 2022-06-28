package Pop_Up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_Assign {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
	       WebElement NewwindowBtn = driver.findElement(By.xpath("//input[@name='NewTab']"));
	       NewwindowBtn.click();
	
	          Set<String> windowId = driver.getWindowHandles();
	          //this method is use to get all window id
	          
	          Iterator<String> readtheinfofromcollection = windowId.iterator();
	          //read the information from collection 
	          
	          String id [] = new String[10];
	          // this for loop is use to print the window id    
	          for(int i =0 ;i<windowId.size();i++)  
	    	    {
	        	  
	        	  id [i] = readtheinfofromcollection.next();
	        	  System.out.println(id [i]);
	        	  
	            }
	          
	          driver.switchTo().window(id [0]);
	          System.out.println("get the title of main window :- "+driver.getTitle());
	          Thread.sleep(4000);
	          driver.close();
	          
	          System.out.println("******************************");
	          
	          driver.switchTo().window(id[1]);
	          System.out.println("Get the titile of child window :- "+driver.getTitle());
	          Thread.sleep(4000);
	          driver.close();
	          
	          
	
	}

}
