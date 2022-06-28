package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		WebElement searchtab = driver.findElement(By.xpath("//input[@name= 'search_query']"));
		Thread.sleep(2400);
		searchtab.sendKeys("Dharamveer Trailer");
		Thread.sleep(2400);
		WebElement SearchButton = driver.findElement(By.xpath("(//yt-icon[@class= 'style-scope ytd-searchbox'])[2]"));
		SearchButton.click();
		Thread.sleep(2400);
		WebElement linkClick = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
		linkClick.click();
		Thread.sleep(2400);
		WebElement FullscreenClick = driver.findElement(By.xpath("//button[@title='Full screen (f)']"));
		FullscreenClick.click();
		
		
	}

}
