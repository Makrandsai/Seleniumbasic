package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rating_Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.amazon.in/WILDHORN%C2%AE-Carter-Leather-Wallet-Black/dp/B08P5LWSS3/ref=zg-bs_luggage_1/258-0741788-4823820?pd_rd_w=WadTP&pf_rd_p=56cde3ad-3235-46d2-8a20-4773248e8b83&pf_rd_r=VQEAXR4AZ18KJ80839VW&pd_rd_r=61210c3f-9c95-48a8-906a-341f505b3e81&pd_rd_wg=LGFjZ&pd_rd_i=B08P5MJSFB&th=1");
		Driver.manage().window().maximize();

		WebElement Rating = Driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star-mini a-star-mini-3-5 sl-carousel-card-customer-review-star'])[1]"));
		
		
		
	}

}
