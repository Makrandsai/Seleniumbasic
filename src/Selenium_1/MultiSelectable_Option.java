package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable_Option {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Driver.manage().window().maximize();
		
		 Driver.switchTo().frame("iframeResult");   //collection and frmae work topic
		 
         WebElement cars = Driver.findElement(By.xpath("//select[@name='cars']"));
         
         Select s = new Select(cars);
         System.out.println(s.isMultiple());
         
         s.selectByVisibleText("Volvo");// for select the element which present in the drop down 
         Thread.sleep(1500);
         s.selectByVisibleText("Saab");
         Thread.sleep(1500);
         s.deselectByVisibleText("Volvo");  // Select thing can deselect by using deselect method
         Driver.close();
	}
}
