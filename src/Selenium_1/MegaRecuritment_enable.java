package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MegaRecuritment_enable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://megrecruitment.nic.in/rpa/register.htm");
		Driver.manage().window().maximize();
		WebElement HusbandnametextBox = Driver.findElement(By.xpath("//input[@name ='husbandsname']"));
		System.out.println("Is Display :- "+HusbandnametextBox.isDisplayed());
		System.out.println("Is enable :- "+HusbandnametextBox.isEnabled());
		System.out.println("Is Select :- "+HusbandnametextBox.isSelected());
		
		System.out.println("****************************************************");
		
		WebElement fathermotherocctextBox = Driver.findElement(By.xpath("//input[@name ='fmoccupation']"));
		System.out.println("Is Display :-  "+fathermotherocctextBox.isDisplayed());
		System.out.println("Is enable:-  "+fathermotherocctextBox.isEnabled());
		System.out.println("Is select :- "+fathermotherocctextBox.isSelected());
		System.out.println("****************************************************");
		
		WebElement EPhcathergorySelectBox = Driver.findElement(By.xpath("//select[@id ='phcategories']"));
		System.out.println("Is select :- "+EPhcathergorySelectBox.isSelected());
		
	}

}
