package Advance_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_W3School {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		 WebElement searchtab = driver.findElement(By.xpath("//input[@onkeydown='key_pressed_in_search(event)']"));
		 searchtab.sendKeys("j");
          Thread.sleep(1500);
		  List<WebElement> suggestions = driver.findElements(By.xpath("//div[@id='listofsearchresults']//a"));
		  
		  for(int i = 0;i<suggestions.size();i++)
		  {
			  System.out.println(suggestions.get(i).getText());
		  }
		  
		  Thread.sleep(2000);
		  for(int i = 0;i<suggestions.size();i++)
		  {
			  String Exp = "JAVA Tutorial";
			  String Act = suggestions.get(i).getText();
			  if(Exp.equals(Act))
			  {
				 suggestions.get(i).click();
				 break;
			  }
			 
		  }
		  System.out.println("JAVA Tutorial : -"+driver.getTitle());
		  
		  Thread.sleep(2000);
		  driver.navigate().back();
		  Thread.sleep(2000);
		  WebElement searchtab1 = driver.findElement(By.xpath("//input[@onkeydown='key_pressed_in_search(event)']"));
		  searchtab1.sendKeys("j");
		  
		  
		  Thread.sleep(2000);
		  List<WebElement> suggestions1 = driver.findElements(By.xpath("//div[@id='listofsearchresults']//a"));
		  
		  for(int i = 0;i<suggestions1.size();i++)
		  {
			  String Exp = "JavaScript Reference";
			  String Act = suggestions1.get(i).getText();
			  if(Exp.equals(Act))
			  {
				  suggestions1.get(i).click();
				  break;
			  }
			  
			  
		  }
		  
		  System.out.println("JavaScript Reference:- "+driver.getTitle());
		  
		  
		  Thread.sleep(2000);
		  driver.close();
	}

}
