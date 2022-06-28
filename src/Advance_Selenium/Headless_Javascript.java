package Advance_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Javascript {

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		   ChromeOptions ab =  new ChromeOptions(); // this is use for without opening browser we can
		   ab.addArguments("headless");//excuate the script and side by side we can perform other task
		  
	       WebDriver driver = new ChromeDriver(ab);
	       driver.get("https://www.google.co.in/");
	       driver.manage().window().maximize();
	       
	       WebElement SearchTab = driver.findElement(By.xpath("//input[@type='text']"));
	       SearchTab.sendKeys("Naren");
	       Thread.sleep(3000);
	       List<WebElement> Autosuggestiondropdown = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	       
	       for(int i =0 ;i<Autosuggestiondropdown.size();i++)
	       {
	    	   
	    	   System.out.println(Autosuggestiondropdown.get(i).getText()); 
	    	   
	       }
	       Thread.sleep(3000);
	       for(int i =0;i<Autosuggestiondropdown.size();i++)
	       {
	    	   String Exp = "narendra modi chennai";
	    	   		//+ "Prime Minister of India";
	    	   String act = Autosuggestiondropdown.get(i).getText();
	    	   if(Exp.equals(act))
	    	   {
	    		   Autosuggestiondropdown.get(i).click();
	    	   }
	    	   
	    	   
	       }
	       Thread.sleep(3000);
	       driver.close();
	}

	}


