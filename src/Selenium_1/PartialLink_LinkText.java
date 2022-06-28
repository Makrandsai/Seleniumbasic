package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink_LinkText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
        Driver.get("http://www.rediff.com/signup/register");
        Driver.manage().window().maximize();
        //Patial Link text Locator
           WebElement BusinessLink = Driver.findElement(By.partialLinkText("email"));
            String value = BusinessLink.getText();
            System.out.println(value);
       
       Thread.sleep(2000);
       BusinessLink.click();
       //LinkList Locator
       WebElement CompanyEmailLink = Driver.findElement(By.linkText("Company email"));
       CompanyEmailLink.click();
       Thread.sleep(2000);
      
       Driver.close();
       
        
	}

}
