package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Driver.manage().window().maximize();
		
		Driver.switchTo().frame("iframeResult");   //collection and frame  work topic
		 
        WebElement cars = Driver.findElement(By.xpath("//select[@name='cars']"));
        // Element Selected in web this methd can give on console
        Select s = new Select(cars);
        s.selectByVisibleText("Audi");
        s.selectByVisibleText("Saab");
            List<WebElement> SelectedOptions = s.getAllSelectedOptions();
            
            for(WebElement options:SelectedOptions)
            {
            	System.out.println(options.getText());
            }
           
        System.out.println("------------------------------------------------");    
            
        // FirstElement which selected this is show by this method
            WebElement SelecetdFirst = s.getFirstSelectedOption();
            
            System.out.println(SelecetdFirst.getText());
            Driver.close();
	}

}
