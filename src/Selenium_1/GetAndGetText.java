package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndGetText {

	private static String name;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://duckduckgo.com/");
		driver.manage().window().maximize();
		
		WebElement linkname = driver.findElement(By.id("search_form_input_homepage"));
		
		String Typevalue = linkname.getText();
		
		System.out.println(Typevalue);

	}

}
