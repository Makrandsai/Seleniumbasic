package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffMailSiteAutomate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.rediff.com/signup/register");
		Driver.manage().window().maximize();
		
		 WebElement FullNameTextBox = Driver.findElement(By.xpath("//input[@id ='fullname']"));
		 FullNameTextBox.sendKeys("Jayesh");
		 Thread.sleep(1500);
		 WebElement CurrentMailTextBox = Driver.findElement(By.xpath("//input[@id ='emailid']"));
		 CurrentMailTextBox.sendKeys("889999india11@gmail.com");
		 Thread.sleep(1500);
		 WebElement NewPasswordTextbox = Driver.findElement(By.xpath("//input[@id ='pass']"));
		 NewPasswordTextbox.sendKeys("India@11");
		 Thread.sleep(1500);
		 WebElement RetypePasswordTextbox = Driver.findElement(By.xpath("//input[@id ='repass']"));
		 RetypePasswordTextbox.sendKeys("India@11");
		 Thread.sleep(1500);
		 WebElement GenderRadiobox = Driver.findElement(By.xpath("//input[@value ='m']"));
		 GenderRadiobox.click();
		 Thread.sleep(1500);
		 WebElement DayListBox = Driver.findElement(By.xpath("//select[@name ='date_day']"));
		 Select s = new Select(DayListBox);
		 s.selectByVisibleText("08");
		 Thread.sleep(1500);
		 
		 WebElement MonthListBox = Driver.findElement(By.xpath("//select[@name ='date_mon']"));
		 Select m = new Select(MonthListBox);
		 m.selectByVisibleText("JUN");
		 Thread.sleep(1500);
		 
		 WebElement YearListBox = Driver.findElement(By.xpath("//select[@name ='Date_Year']"));
		 Select r = new Select(YearListBox);
		 r.selectByVisibleText("2000");
		 Thread.sleep(1500);
		 
		 WebElement LocationTextbox = Driver.findElement(By.xpath("//input[@name ='city']"));
		 LocationTextbox.sendKeys("Nashik");
		 Thread.sleep(1500);
		 WebElement SchoolTextbox = Driver.findElement(By.xpath("//input[@name ='school']"));
		 SchoolTextbox.sendKeys("KK Mandir");
		 Thread.sleep(1500);
		 WebElement CollegeTextbox = Driver.findElement(By.xpath("//input[@name ='college']"));
		 CollegeTextbox.sendKeys("NBN");
		 Thread.sleep(1500);
		 WebElement CaptchaTextBox = Driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		 CaptchaTextBox.sendKeys("Captcha Not Automate In selenium");
		 Thread.sleep(1500);
		 WebElement SignUpButtonClick = Driver.findElement(By.xpath("//input[@value='Sign up']"));
		 SignUpButtonClick.click();
		 Thread.sleep(1500);
		 
//		 WebElement DomainRegClick = Driver.findElement(By.xpath("//a[text() ='Domain registration']"));
//		 DomainRegClick.click();
//		 Thread.sleep(1500);
//		 Driver.navigate().back();
//		 Thread.sleep(1500);
//		 Driver.navigate().forward();
//		 Thread.sleep(1500);
		 
		 Driver.quit();
		 
	}
}
