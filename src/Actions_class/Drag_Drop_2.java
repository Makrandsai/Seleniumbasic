package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/drag_drop.html");
	     driver.manage().window().maximize();
	     
	     
	     WebElement ele5000 = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']//a[@class='button button-orange']"));
	     WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']//a[@class='button button-orange']"));
	     WebElement sale = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']//a[@class='button button-orange']"));
         WebElement accountdebitside = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
	     WebElement amountdebitside = driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable' and @id='amt7']"));
	     WebElement accountcreditside = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
	     WebElement amountcreditside = driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable' and @id='amt8']"));
	     
	     Actions a = new Actions(driver);
	     
	     a.dragAndDrop(bank, accountdebitside).build().perform();
	     Thread.sleep(3000);
	     a.dragAndDrop(ele5000, amountdebitside).build().perform();
	     Thread.sleep(3000);
	     a.dragAndDrop(sale, accountcreditside).build().perform();
	     Thread.sleep(3000);
	     a.dragAndDrop(ele5000, amountcreditside).build().perform();
	     Thread.sleep(3000);
	     
	     
	    WebElement result = driver.findElement(By.xpath("//div[@class='table4_result']//a[@class='button button-green']"));
	    
	    String exp = "Perfect!";
	    String Act = result.getText();
	    
	    if(exp.equals(Act))
	    {
	    	System.out.println("test case of drag and drop PASS ");
	    }
	    
	    else
	     {
	    	 
	    	 System.out.println("test case of drag and drop FAIL");
	     }
	    
	    
	    Thread.sleep(3000);
	    
	    driver.close();
	}

}
