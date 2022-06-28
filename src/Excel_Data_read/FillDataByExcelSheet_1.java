package Excel_Data_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillDataByExcelSheet_1 {

	public static void main(String[] args) throws EncryptedDocumentException,FileNotFoundException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		WebElement YourFullNameTextBox = driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement MailIdTextBox = driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement NewPassTextBox = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement RetypePassTextBox = driver.findElement(By.xpath("//input[@name='repass']"));
		
		WebElement DateDropDown = driver.findElement(By.xpath("//select[@name='date_day']"));
		Select s = new Select(DateDropDown);
		WebElement MonthDropDown = driver.findElement(By.xpath("//select[@name='date_mon']"));
		Select m = new Select(MonthDropDown);
		WebElement YearDropDown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select l = new Select(YearDropDown);
		
		WebElement LocationTextBox = driver.findElement(By.xpath("//input[@name='city']"));
		WebElement SchoolTextBox = driver.findElement(By.xpath("//input[@name='school']"));
		WebElement CollegeTextBox = driver.findElement(By.xpath("//input[@name='college']"));
		WebElement CpatchaEnterTextBox = driver.findElement(By.xpath("//input[@name='fld_captcha']"));
		WebElement SignUpButton= driver.findElement(By.xpath("//input[@value='Sign up']"));
		
	    FileInputStream file = new FileInputStream("C:\\Users\\Om Sai\\eclipse-workspace\\26FEb_NewSelenium\\TestData\\TestData6.xlsx");
		Sheet Details = WorkbookFactory.create(file).getSheet("info");
		
		YourFullNameTextBox.sendKeys(Details.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1500);
		MailIdTextBox.sendKeys(Details.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(1500);
		NewPassTextBox.sendKeys(Details.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(1500);
		RetypePassTextBox.sendKeys(Details.getRow(0).getCell(3).getStringCellValue());
		Thread.sleep(1500);
		s.selectByVisibleText(Details.getRow(0).getCell(4).getStringCellValue());
		Thread.sleep(1500);
		m.selectByVisibleText(Details.getRow(0).getCell(5).getStringCellValue());
		Thread.sleep(1500);
		l.selectByVisibleText(Details.getRow(0).getCell(6).getStringCellValue());
		Thread.sleep(1500);
		LocationTextBox.sendKeys(Details.getRow(0).getCell(7).getStringCellValue());
		Thread.sleep(1500);
		SchoolTextBox.sendKeys(Details.getRow(0).getCell(8).getStringCellValue());
		Thread.sleep(1500);
		CollegeTextBox.sendKeys(Details.getRow(0).getCell(9).getStringCellValue());
		Thread.sleep(1500);
		CpatchaEnterTextBox.sendKeys(Details.getRow(0).getCell(10).getStringCellValue());
		Thread.sleep(1500);
		
		SignUpButton.click();
		
		Thread.sleep(1500);
		
		driver.close();
		
	}

    }
