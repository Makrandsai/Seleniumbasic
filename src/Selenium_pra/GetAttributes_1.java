package Selenium_pra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com/signup/register");
		driver.manage().window().maximize();
		
              
		
		WebElement FirstnameTab = driver.findElement(By.xpath("//input[@name='fullname']"));
		FirstnameTab.sendKeys("Harry");
		
		System.out.println(FirstnameTab.getAttribute("value"));
		
		driver.close();
		
		
	}

}
