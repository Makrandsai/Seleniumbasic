package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	     driver.manage().window().maximize();
	       
	     WebElement frameobj = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	     driver.switchTo().frame(frameobj);
	     
	     WebElement Img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	                                                    
	     WebElement Img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	     WebElement Img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	     WebElement Img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
	     
	     WebElement trash = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
	     Actions a = new Actions(driver);
	   // by using drag and drop method.  
//	     a.dragAndDrop(Img1, trash).build().perform();
//	     Thread.sleep(3000);
//	     
//	     a.dragAndDrop(Img2, trash).build().perform();
//	     Thread.sleep(3000);
//	     
//	     a.dragAndDrop(Img3, trash).build().perform();
//	     Thread.sleep(3000);
//	     
//	     a.dragAndDrop(Img4, trash).build().perform();
//	     Thread.sleep(3000);
	     
	     
	     // by using keyborad an mouce action
	  	 a.moveToElement(Img1).clickAndHold().moveToElement(trash).release().build().perform();
	  	 Thread.sleep(3000);
	    
	     a.moveToElement(Img2).clickAndHold().moveToElement(trash).release().build().perform();
	     Thread.sleep(3000);
	     
	     a.moveToElement(Img3).clickAndHold().moveToElement(trash).release().build().perform();
	     Thread.sleep(3000);
	     
	     a.moveToElement(Img4).clickAndHold().moveToElement(trash).release().build().perform();
	     Thread.sleep(3000);
	     
	     driver.close();
	  
	     	}

}
