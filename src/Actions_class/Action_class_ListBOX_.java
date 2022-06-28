package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//https://www.railyatri.in/train-ticket/create-new-irctc-user
  public class Action_class_ListBOX_ {

	public static void main(String[] args) throws InterruptedException {
		
		
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
	       driver.manage().window().maximize();
	       //suppose the spaces and in the text that we use the normalize x path by text method
           //WebElement dropdown1 = driver.findElement(By.xpath("//button[normalize-space(text())='Select']"));
	       WebElement dropdownbtn = driver.findElement(By.xpath("(//button[@class ='btn dropdown-toggle'])[1]"));
           // dropdownbtn.click();
	        
	
	       Actions act = new Actions(driver);
	       act.moveToElement(dropdownbtn).click().build().perform();
	      
          // act.wait(5000); :- this is not allow 
           for(int i=0;i<7;i++)
           {
        	   
        	   Thread.sleep(3000);
        	   act.sendKeys(Keys.DOWN).build().perform();
        	  
        	   
           }
           
//           for(int i=0;i<3;i++)
//           {
           
//        	   Thread.sleep(3000);
//        	   act.sendKeys(Keys.UP).build().perform();
//        	 
              
//           }
           
            act.sendKeys(Keys.ENTER).build().perform();
          //act.sendKeys(Keys.LEFT).build().perform();
           
            Thread.sleep(6000);
            driver.close();
        
           
	}

    }
