package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SQA_Site {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/");
		driver.manage().window().maximize();
		
		WebElement mainSearchTab = driver.findElement(By.xpath("//input[@name='s']"));
		mainSearchTab.sendKeys("Testing");
		WebElement MainSearchButton = driver.findElement(By.xpath("//button[@class='button_search']"));
		MainSearchButton.click();
		
	}

}
