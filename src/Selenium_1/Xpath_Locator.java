package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=589460569891&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwsJ6TBhAIEiwAfl4TWCJoUvcEQkMFToUHCepH5Rpor2fySC5Y-frRTLtkoznp8of9K4a2mhoChM4QAvD_BwE");
//		driver.manage().window().maximize();
//	   
//		driver.findElement(By.xpath("//input[@name='firstname'] ")).sendKeys("Harsh");
		
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name ='fullName']")).sendKeys("Makrand Temkar");
		
	}
}
