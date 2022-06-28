package Actions_class;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class_RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     driver.manage().window().maximize();
	       
	     WebElement rightclickbtn = driver.findElement(By.xpath("//span[text()='right click me']"));
	      
	     Thread.sleep(3000);
	     Actions act = new Actions(driver);
	     
	     act.contextClick(rightclickbtn).build().perform();
	    
        List<WebElement> popUp = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li"));
        
        Thread.sleep(3000);
        for(int i =0;i<popUp.size();i++)
        {
        	String Expected = "Cut";
        	String Act = popUp.get(i).getText();
        	
        	if(Expected.equals(Act))
        	{
        		
        		popUp.get(i).click();
        		break;
        		
        	}
        }
          
        Thread.sleep(3000);
        Alert Popup1 = driver.switchTo().alert();
        Popup1.accept();
        
        Thread.sleep(3000);
        driver.close();
	}

}
