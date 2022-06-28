package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Page_2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("wedriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		
		
		WebElement contactbtn = driver.findElement(By.xpath("//span[text() = 'Quick Contact']"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();", contactbtn);

         Thread.sleep(4000);
		 driver.close();
	}

}
