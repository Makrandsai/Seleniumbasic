package Pop_Up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_Handle_1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
		 WebElement openPopbtn = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		 openPopbtn.click();
		    System.out.println(driver.getWindowHandle()); // to get first single window id 
		    Set<String> Windowid = driver.getWindowHandles();
		   
		 // it is use for store the or get the window id
		    
		    Iterator<String> readwindowId = Windowid.iterator();
		  // it is use to read the data from the collection 
		    
		    String value [] = new String [10];
		    
		    for(int i = 0;i<Windowid.size();i++)
	    {		    		    	
		    	value [i] = readwindowId.next();
	           System.out.println(value [i] );
	    }
		  
		    driver.switchTo().window(value[0]);
		    
		    System.out.println("mainwindow Title :- "+driver.getTitle());
		    Thread.sleep(5000);
		    driver.manage().window().minimize();
		    Thread.sleep(5000);
		    driver.close();
		    
            driver.switchTo().window(value[1]);
		    
		    System.out.println("Child Window Title:- "+driver.getTitle());
		    Thread.sleep(5000);
		    driver.manage().window().maximize();
		    Thread.sleep(5000);
		    driver.close();
		    
		   //System.out.println(driver.getWindowHandles());
		
	}

}
