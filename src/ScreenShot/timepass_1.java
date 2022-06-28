package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class timepass_1 {

	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com/signup/register");
		driver.manage().window().maximize();
		
           File Bydefault = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           
           File dest = new File("C:\\Users\\Om Sai\\eclipse-workspace\\26FEb_NewSelenium\\Screenshots\\Mak.jpeg");
           
           FileHandler.copy(Bydefault, dest);
           
           driver.close();
           
           
	}

}
