package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifrmae_SQASite_Assignment {

	public static void main(String[] args) throws  InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		
		WebElement SearchTab1 = driver.findElement(By.xpath("//input[@id='s'][1]"));
		SearchTab1.sendKeys("Data");
		Thread.sleep(1500);
		WebElement SearchButton1 = driver.findElement(By.xpath("//button[@class='button_search']"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", SearchButton1);
		
		
		Thread.sleep(1500);
		
		
		driver.navigate().back();
		
		driver.switchTo().frame("globalSqa");
		
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("java");
		Thread.sleep(1500);
	    driver.findElement(By.xpath("//button[@class='button_search']")).click();
		Thread.sleep(1500);
		
		driver.close();
		
		
	}

}
