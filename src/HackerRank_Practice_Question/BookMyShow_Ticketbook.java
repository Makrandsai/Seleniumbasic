package HackerRank_Practice_Question;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookMyShow_Ticketbook {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver ", "chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/jalgaon");
		driver.manage().window().maximize();
		WebElement DharmaveerImg = driver.findElement(By.xpath("//img[@alt='Dharmaveer']"));
		DharmaveerImg.click();
		Thread.sleep(1500);
		
		WebElement popup = driver.findElement(By.xpath("//button[@class='No thanks']"));
		popup.click();
		Thread.sleep(1500);
		
		WebElement BookTicketButton = driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]"));
		BookTicketButton.click();
		Thread.sleep(1500);
		
		WebElement TicketBookShowSixPm = driver.findElement(By.xpath("//a[@data-display-showtime='06:20 PM']"));
		TicketBookShowSixPm.click();
		Thread.sleep(1500);
		WebElement AcceptRulewarning = driver.findElement(By.xpath("//div[@id='btnPopupAccept']"));
		AcceptRulewarning.click();
		Thread.sleep(1500);
		WebElement SelectSeatThree = driver.findElement(By.xpath("//li[@id='pop_3']"));
		SelectSeatThree.click();
		Thread.sleep(1500);
		WebElement SelectSeatSubmit = driver.findElement(By.xpath("//div[@id='proceed-Qty']"));
		SelectSeatSubmit.click();
		Thread.sleep(1500);
		 WebElement seatloacation = driver.findElement(By.xpath("(//a[@class='_available'])[1]"));
					seatloacation.click(); 
					Thread.sleep(1500);
					
//		Select s = new Select(seatloacation);
//		List<WebElement> selecttheseat = s.getAllSelectedOptions();
//		
//		s.selectByVisibleText("8");
//		
		Thread.sleep(1500);
		
		WebElement paynowbutton = driver.findElement(By.xpath("(//a[@id='btmcntbook'])[1]"));
		paynowbutton.click();
		Thread.sleep(1500);
		WebElement payproceed = driver.findElement(By.xpath("//div[@id='prePay']"));

		Thread.sleep(1500);
		
		
	}
	

}
