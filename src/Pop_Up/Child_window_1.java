package Pop_Up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_window_1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
		WebElement openPopbtn = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		 openPopbtn.click();
		      Set<String> window1naame = driver.getWindowHandles();
		      window1naame.getClass();
		      
		    System.out.println(driver.getWindowHandle());
		    
		    System.out.println(driver.getWindowHandles());
		    
            driver.switchTo().window("");
	}

}
