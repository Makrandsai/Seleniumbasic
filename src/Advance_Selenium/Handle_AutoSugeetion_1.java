package Advance_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_AutoSugeetion_1 {

	public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.co.in/");
       driver.manage().window().maximize();
     
       
       WebElement SearchTab = driver.findElement(By.xpath("//input[@name ='q']"));
       SearchTab.sendKeys("kend");
       Thread.sleep(3000); 
       
       List<WebElement> autosuggestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        //System.out.println(autosuggestion.size());
        
        for(int i =0 ;i<autosuggestion.size();i++)
        {
        	
        	System.out.println(autosuggestion.get(i).getText());
        	
        }
        
        for(int i =0 ;i<autosuggestion.size();i++)
        {
        	String expected = "kendriya vidyalaya";
        	String Actual = autosuggestion.get(i).getText();
        	if(expected.equals(Actual))
        	{
        		autosuggestion.get(i).click();
        		break;
        	}
        }
        
        Thread.sleep(2000);
        
        System.out.println(driver.getTitle());
        driver.close();
	}

}
