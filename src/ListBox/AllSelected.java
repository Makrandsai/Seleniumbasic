package ListBox;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement cars = driver.findElement(By.xpath("//select[@name='cars']"));
		Select S = new Select(cars);
		
		S.selectByVisibleText("Saab");
		S.selectByVisibleText("Audi");
		
		          List<WebElement> selectedOptions = S.getAllSelectedOptions();
		          
		          for(WebElement option:selectedOptions) 
		          {
		        	  System.out.println(option.getText());
		          }
//		          for(int i=0;i<selectedOptions.size();i++)
//		          {
//		        	  System.out.println(selectedOptions.get(i).getText());
//		          }
		driver.close();
		
	}

}

	