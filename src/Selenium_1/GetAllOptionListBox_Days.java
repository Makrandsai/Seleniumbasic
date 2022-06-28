package Selenium_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionListBox_Days {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.rediff.com/signup/register");
		Driver.manage().window().maximize();
		
		WebElement DayListBox = Driver.findElement(By.xpath("//select[@name ='date_day']"));
		
		Select s = new Select(DayListBox);
		List<WebElement> options = s.getOptions();  // for list/drop down element
		
		for(int i = 0;i<options.size();i++)
		{
			System.out.println(options.get(i));
		}
	    System.out.println("*******************************************");	
		for(int i = 0;i<32;i++)
		{
			System.out.println(options.get(i).getText());
		}
		System.out.println("*******************************************");	
		for(WebElement Value: options)
		{
			System.out.println(Value.getText());
		}
		System.out.println("*******************************************");		
		
		System.out.println(s.isMultiple());  // Means Multiple Option select karna possible ahe ka te te Chcek karto
		Driver.close();
	}

}
