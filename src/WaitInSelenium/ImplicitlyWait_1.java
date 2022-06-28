package WaitInSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitlyWait_1 {

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.google.co.in/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	       
	       WebElement SearchTab = driver.findElement(By.xpath("//input[@type='text']"));
	       SearchTab.sendKeys("Naren");
	       //Thread.sleep(10000);
	       List<WebElement> Autosuggestiondropdown = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	       
	       for(int i =0 ;i<Autosuggestiondropdown.size();i++)
	       {
	    	   
	    	   System.out.println(Autosuggestiondropdown.get(i).getText()); 
	    	   
	       }
	       //Thread.sleep(3000);
	       for(int i =0;i<Autosuggestiondropdown.size();i++)
	       {
	    	   String Exp = "narendra maharaj";
	    	   		
	    	   String act = Autosuggestiondropdown.get(i).getText();
	    	   if(Exp.equals(act))
	    	   {
	    		   Autosuggestiondropdown.get(i).click();
	    		   break;
	    	   }
	    	   
	    	   
	       }
	       //Thread.sleep(3000);
	       driver.close();
	    
	}

}
