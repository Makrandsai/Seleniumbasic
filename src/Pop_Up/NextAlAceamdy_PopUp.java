package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextAlAceamdy_PopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		
	    
		WebElement AlertPop = driver.findElement(By.xpath("//button[@name ='confirmalertbox']"));
		AlertPop.click();
		Thread.sleep(2500);
		Alert pop = driver.switchTo().alert();
		Thread.sleep(2500);
		pop.accept();
		//pop.dismiss();
		Thread.sleep(2500);
		 WebElement Meaasge = driver.findElement(By.xpath("//p[@id ='demo']"));
		System.out.println(Meaasge.getText());
		Thread.sleep(2500);
		WebElement Promtbutton = driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		Promtbutton.click();
		Thread.sleep(2500);
		Alert PopUpname = driver.switchTo().alert();
		Thread.sleep(2500);
		PopUpname.sendKeys("Makrand");
		Thread.sleep(2500);
		PopUpname.accept();
		WebElement text1= driver.findElement(By.xpath("//p[@id='demoone']"));
		System.out.println(text1.getText());
		
		Thread.sleep(2500);
		driver.close();
	
		
	}

}
