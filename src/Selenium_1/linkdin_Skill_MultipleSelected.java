package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class linkdin_Skill_MultipleSelected {

	public static void main(String[] args) {
		
         System.setProperty("webdriver.chrome.driver","chromedriver.exe");
         WebDriver Driver= new  ChromeDriver();
         Driver.get("https://www.linkedin.com/in/makrand-temkar-55ba3b174/details/skills/edit/forms/new/?profileFormEntryPoint=PROFILE_SECTION&trackingId=ZtOWQJa6R426wOo6%2BuOnrw%3D%3D");
	     Driver.manage().window().maximize();
	     
         WebElement SkillSelection = Driver.findElement(By.xpath("//input[@id='single-typeahead-entity-form-component-profileEditFormElement-SKILL-AND-ASSOCIATION-skill-ACoAAClxuFcByu1TSvBZvodhyEnaWr3LUqU602I-1-name']"));
         
	     Select s =new Select(SkillSelection);
	     System.out.println("Selected for Multiple :- "+s.isMultiple());
	     Driver.close();
	     
	}
	
	
	
}
