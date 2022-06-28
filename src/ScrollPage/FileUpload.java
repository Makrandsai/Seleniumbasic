package ScrollPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//file upload possible only if attribute name should be type and value is file
		WebElement fileuploadbtn = driver.findElement(By.xpath("//input[@type='file']"));
		
		WebElement pressbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		fileuploadbtn.sendKeys("C:\\Users\\Om Sai\\Desktop\\Logical Program 1.docx");
		Thread.sleep(8000);
		pressbtn.click();
	

		driver.close();
		
		
	}

}
