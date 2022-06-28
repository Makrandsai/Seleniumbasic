package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_2_forOkaction{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
        WebElement Altbutton1 = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
        Altbutton1.click();
        Thread.sleep(5000);
        WebElement pop1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        pop1.click();
        Thread.sleep(5000);
        Alert actiononpopup = driver.switchTo().alert();
        System.out.println(actiononpopup.getText());
        
        actiononpopup.accept();
        Thread.sleep(5000);
      
        driver.close();
        
	}

}
