package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_2_forOk_CancleButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement Altbutton3 = driver.findElement(By.xpath("//a[text() ='Alert with Textbox ']"));
        Altbutton3.click();
        Thread.sleep(2500);
        WebElement PopUp3 = driver.findElement(By.xpath("//button[text() ='click the button to demonstrate the prompt box ']"));
        PopUp3.click();
        Thread.sleep(2500);
        Alert altertpopup3 = driver.switchTo().alert();
        Thread.sleep(5500);
        altertpopup3.sendKeys("My village is Jalgaon");
        Thread.sleep(5500);
        altertpopup3.accept();
        //altertpopup3.dismiss();
        
       WebElement textInfo = driver.findElement(By.xpath("//p[@id='demo1']"));
       
        System.out.println(textInfo.getText());
      
        Thread.sleep(5500);
        
        driver.close();
        
	}

}
