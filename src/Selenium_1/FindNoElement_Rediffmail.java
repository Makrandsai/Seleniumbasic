package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoElement_Rediffmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://www.rediff.com/signup/register");
		Driver.manage().window().maximize();
		//for get Current Url 
		System.out.println("Url Of Webpage"+Driver.getCurrentUrl());
		// for get the title of web page 
		String ActualTitle = Driver.getTitle();
		System.out.println("WebSite title"+Driver.getTitle());
		String Expectedtitle ="Rediff.com";
		if(ActualTitle.equals(Expectedtitle))
		{
			System.out.println("Correct Title of rediffmaili signup webpage ");
		}
		else
		{
			System.out.println("Incorrect Title of Rediffmail site");
		}
		//
		WebElement Reddifmail = Driver.findElement(By.xpath("//img[@alt='Rediff.com']"));
		WebElement SigninLinkText = Driver.findElement(By.xpath("//a[text()='Sign in']"));
		WebElement CreateNewAccLinkText = Driver.findElement(By.xpath("//a[text()='Create a Rediffmail account']"));
		WebElement NewUserRegLabelText = Driver.findElement(By.xpath("//b[text()='New User? Register here']"));	
		WebElement TellUsLabelText = Driver.findElement(By.xpath("(//p[contains(@class,'grey1')])[1]"));
		WebElement YourFullNameLabelText = Driver.findElement(By.xpath("//div[text() ='Your Full name']"));
		WebElement YourCurrentMailLabelText = Driver.findElement(By.xpath("//div[text() ='Your current email ID']"));
		WebElement NewPasswordLabelText = Driver.findElement(By.xpath("//div[text() ='New password']"));
		WebElement RetypePasswordLabelText = Driver.findElement(By.xpath("//div[text() ='Retype password']"));
		WebElement GenderLabelText = Driver.findElement(By.xpath("//div[text() ='Gender:']"));
		WebElement DOBLabelText = Driver.findElement(By.xpath("//div[text() ='Date of Birth']"));
		WebElement LocationLabelText = Driver.findElement(By.xpath("//div[text() ='Location']"));
		WebElement SchoolLabelText = Driver.findElement(By.xpath("//div[text() ='School']"));
		WebElement CollegeLabelText = Driver.findElement(By.xpath("//div[text() ='College']"));
		WebElement EnterCaptchLabelText = Driver.findElement(By.xpath("//div[text() ='Enter the code given in the above image']"));
		
		WebElement BusninessEmailLinkText = Driver.findElement(By.xpath("//a[text()='Business email']"));
		WebElement OfficalEmailLinkText = Driver.findElement(By.xpath("//a[text()='Office email App']"));
		WebElement DomianRegLinkText = Driver.findElement(By.xpath("//a[text()='Domain registration']"));
		WebElement WebsiteLinkText = Driver.findElement(By.xpath("//a[text()='Website']"));
		WebElement RediffmailLinkText = Driver.findElement(By.xpath("//a[text()='Rediffmail']"));
		WebElement MoneyLinkText = Driver.findElement(By.xpath("//a[text()='Money']"));
		WebElement CompanyEmailLinkText = Driver.findElement(By.xpath("//a[text()='Company email']"));
		WebElement OnlineShoppingLinkText = Driver.findElement(By.xpath("//a[text()='Online Shopping']"));
		WebElement BookLinkText = Driver.findElement(By.xpath("//a[text()='Books']"));
		WebElement GiftsLinkText = Driver.findElement(By.xpath("//a[text()='Gifts']"));
		WebElement VideosLinkText = Driver.findElement(By.xpath("//a[text()='Videos']"));
		WebElement ImgOfrediff = Driver.findElement(By.xpath("//img[@alt='rediff on the net']"));  // doubt below 1
		
		WebElement InvestorLinktext = Driver.findElement(By.xpath("//a[text()='Investor Information']")); 
		WebElement AdvertiseLinktext = Driver.findElement(By.xpath("//a[text()='Advertise with us']")); 
		WebElement DisclamirLinktext = Driver.findElement(By.xpath("//a[text()='Disclaimer']")); 
		WebElement PrivacyPolicyLinktext = Driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		WebElement feedbackLinktext = Driver.findElement(By.xpath("//a[text()='Feedback']"));
		WebElement AboutUsLinktext = Driver.findElement(By.xpath("//a[text()='About us']"));
		WebElement termstouseLinktext = Driver.findElement(By.xpath("//a[text()='Terms of use']"));
		WebElement grievanceLinktext = Driver.findElement(By.xpath("//a[text()='Grievances']"));
		
		
		WebElement FullNameTextBox = Driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement EmailIDTextBox = Driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement EgEmailidlabletext = Driver.findElement(By.xpath("//p[text()='eg: myname@gmail.com,  myname@yahoo.com']"));
		WebElement NewPassTextBox = Driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement RetypepassTextBox = Driver.findElement(By.xpath("//input[@name='repass']"));
		WebElement MaleRadiobox = Driver.findElement(By.xpath("//input[@value='m']"));
		WebElement feMaleRadiobox = Driver.findElement(By.xpath("//input[@value='f']"));
		WebElement DayListbox = Driver.findElement(By.xpath("//select[@name='date_day']"));
		WebElement MonthListbox = Driver.findElement(By.xpath("//select[@name='date_mon']"));
		WebElement YearListbox = Driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement LocationtextBox= Driver.findElement(By.xpath("//input[@name='city']"));
		WebElement SchooltextBox= Driver.findElement(By.xpath("//input[@name='school']"));
		WebElement CollegetextBox= Driver.findElement(By.xpath("//input[@name='college']"));
		WebElement ImgCpatchlable= Driver.findElement(By.xpath("//img[@name='img_captcha']"));
		WebElement Cpatchtextbox= Driver.findElement(By.xpath("//input[@name='fld_captcha']"));
		WebElement SingUpButton = Driver.findElement(By.xpath("//input[@value='Sign up']"));
		
		int count = 0;
		if(Reddifmail.isDisplayed())
		{
			
			System.out.println("Rediffmaail Logo display");
			count++;
		}
		else
		{
			System.out.println("Rediffmaail Logo not display");
		}
		
		
		if(SigninLinkText.isDisplayed())
		{
			
			System.out.println("SigninLink text display");
			count++;
		}
		else
		{
			System.out.println("SigninLink text not display");
		}
		
		
		
//		if(CreateNewAccLinkText.isDisplayed())
//		{
//			count++;
//			System.out.println("CreateNew Account Link text display");
//		}
//		else
//		{
//			System.out.println("CreateNew Account Link text Not display");
//		}
//		
//		if(NewUserRegLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("New User Regsiter user  text display");
//		}
//		else
//		{
//			System.out.println("CreateNew Account Link text Not display");
//		}
//		
//		if(TellUsLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("Tell us Lable text Display");
//		}
//		else
//		{
//			System.out.println("Tell us Lable text Not  Display");
//		}
//		
//		if(YourFullNameLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("Your Full name lable text display");
//		}
//		else
//		{
//			System.out.println("Your Full name lable text not display");
//		}
//		
//		if(YourCurrentMailLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("Your Current Mail lable text display");
//		}
//		else
//		{
//			System.out.println("Your Current Mail lable text Not display");
//		}
//		if(NewPasswordLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("New password lable text display");
//		}
//		else
//		{
//			System.out.println("New password lable text Not display");
//		}
//		
//		
//		if(RetypePasswordLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("ReType password lable text display");
//		}
//		else
//		{
//			System.out.println("ReType password lable text not display");
//		}
//		
//		if(GenderLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("Gender lable text display");
//		}
//		else
//		{
//			System.out.println("Gender lable text Not display");
//		}
//		
//		if(DOBLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("DOB lable text display");
//		}
//		else
//		{
//			System.out.println("DOB lable text Not display");
//		}
//		
//		
//		if(LocationLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("Location lable text display");
//		}
//		else
//		{
//			System.out.println("Location lable text Not display");
//		}
//		
//		if(SchoolLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("School lable text display");
//		}
//		else
//		{
//			System.out.println("School lable text  Not  display");
//		}
//		
//		if(CollegeLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("College lable text display");
//		}
//		else
//		{
//			System.out.println("College lable text not display");
//		}
//		
//		
//		if(EnterCaptchLabelText.isDisplayed())
//		{
//			count++;
//			System.out.println("Enter capatch lable text display");
//		}
//		else
//		{
//			System.out.println("Enter capatch lable text not display");
//		}
//		
//		if(BusninessEmailLinkText.isDisplayed())
//		{
//			count++;
//			System.out.println("Busniess Email link text display");
//		}
//		else
//		{
//			System.out.println("Busniess Email link text not display");
//		}
//		
//		if(OfficalEmailLinkText.isDisplayed())
//		{
//			count++;
//			System.out.println("Official Email link text display");
//		}
//		else
//		{
//			System.out.println("Official Email link text display");
//		}
//		
//		if(DomianRegLinkText.isDisplayed())
//		{
//			count++;
//			System.out.println("Domain Reg link text display");
//		}
//		else
//		{
//			System.out.println("Domain Reg link text display");
//		}
//		
//		
//		if(WebsiteLinkText .isDisplayed())
//		{
//			count++;
//			System.out.println("Website link text display");
//		}
//		else
//		{
//			System.out.println("Website link text display");
//		}
//
//         
		
		
		Driver.close();
		System.out.println("No of WebElement on SignupPage "+count);
		
	}

}
