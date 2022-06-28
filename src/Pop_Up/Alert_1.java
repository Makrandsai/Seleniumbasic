package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	   WebElement SigninButtton = driver.findElement(By.xpath("//input[@type='submit']"));
	   SigninButtton.click();
	   Thread.sleep(5000);
	   Alert pop = driver.switchTo().alert();
       String text = pop.getText();
	   
	   System.out.println(text);
	   pop.dismiss();
	   Thread.sleep(5000);
	   
	   driver.close();
	
	   
	   
	}

}
