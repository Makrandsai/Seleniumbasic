package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_ListElemnts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        WebElement ListAdreess = driver.findElement(By.xpath("//select[@name ='cars']"));
        
        Select s =new Select(ListAdreess);
        
        s.selectByVisibleText("Audi");
        s.selectByVisibleText("Saab");
        
         List<WebElement> selected = s.getOptions();
      
         for(WebElement value: selected)
         {
        	 System.out.println(value.getText());
         }
         
       System.out.println("********************************");
       
       List<WebElement> selected1 = s.getAllSelectedOptions();
         for(WebElement value1: selected1)
         {
        	 System.out.println(value1.getText());
         }
       
         driver.close();
	}

}
