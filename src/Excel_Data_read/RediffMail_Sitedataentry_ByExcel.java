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

public class RediffMail_Sitedataentry_ByExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
   System.setProperty("webdriver.chrome.driver ", "chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("http://www.rediff.com/signup/register");
   driver.manage().window().maximize();
   
   
        WebElement fullnametab = driver.findElement(By.xpath("//input[@name='fullname']"));
        WebElement Mailidtab = driver.findElement(By.xpath("//input[@name='emailid']"));
        WebElement Passwordtab = driver.findElement(By.xpath("//input[@name='pass']"));
        
        
        FileInputStream file = new FileInputStream("C:\\Users\\Om Sai\\eclipse-workspace\\26FEb_NewSelenium\\TestData\\TestData10.xlsx");
        
       Sheet excelname = WorkbookFactory.create(file).getSheet("info");
       
       fullnametab.sendKeys(excelname.getRow(0).getCell(0).getStringCellValue());
       Thread.sleep(2500);
       System.out.println(fullnametab.getText());
       
       Mailidtab.sendKeys(excelname.getRow(0).getCell(1).getStringCellValue());
       System.out.println(Mailidtab.getText());
       Thread.sleep(2500);
       Passwordtab.sendKeys(excelname.getRow(1).getCell(0).getStringCellValue());
       System.out.println(Passwordtab.getText());
        
       Thread.sleep(2500);
       
       driver.close();
       
	}

}
