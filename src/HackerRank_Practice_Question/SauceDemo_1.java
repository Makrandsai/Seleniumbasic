package HackerRank_Practice_Question;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SauceDemo_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver ", "chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.xpath("//input[@id ='user-name']"));
		Username.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement Password = driver.findElement(By.xpath("//input[@id ='password']"));
		Password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		WebElement LoginButton = driver.findElement(By.xpath("//input[@id ='login-button']"));
		LoginButton.click();
		Thread.sleep(1000);
		 WebElement SortingListBox = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		      Thread.sleep(1000);
		         Select s = new Select(SortingListBox);
	             s.selectByVisibleText("Price (low to high)");
	             Thread.sleep(1000);
	     
	    WebElement AddCart1 = driver.findElement(By.xpath(" (//button[@class='btn btn_primary btn_small btn_inventory'])[1]"));
	    AddCart1.click();	 
	    Thread.sleep(2500); 
	    WebElement AddCartLogo = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    AddCartLogo.click();	
	    Thread.sleep(1500);
	    WebElement Removebutton = driver.findElement(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));
	    Removebutton.click();	   
	    Thread.sleep(1500);
	    WebElement ContionueShoppingbutton = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_medium']"));
	    ContionueShoppingbutton.click();	
	    Thread.sleep(2000);
	    WebElement SortingListBox2 = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	    Select s2 = new Select(SortingListBox2);
	    Thread.sleep(1000);
	    s2.selectByVisibleText("Price (low to high)");
        Thread.sleep(1000);
        
        WebElement AddCart2 = driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[2]"));
        AddCart2.click();	 
	    Thread.sleep(2500);
	    WebElement AddCartLogo1 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    AddCartLogo1.click();	
	    Thread.sleep(1500);
       
	    WebElement Checkoutbutton = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
	    Checkoutbutton.click();	
	    Thread.sleep(1500);
	    
	    WebElement Firstname = driver.findElement(By.xpath("//input[@data-test='firstName']"));
	    Firstname.sendKeys("David");
		Thread.sleep(1000);
		 WebElement lastname = driver.findElement(By.xpath("//input[@data-test='lastName']"));
		 lastname.sendKeys("hendrey");
	     Thread.sleep(1000);
	     WebElement Zipcode = driver.findElement(By.xpath("//input[@data-test='postalCode']"));
	     Zipcode.sendKeys("458985");
		 Thread.sleep(1000);
		 WebElement Contionuebutton = driver.findElement(By.xpath("//input[@data-test='continue']"));
		 Contionuebutton.click();	
	     Thread.sleep(1500);

	     
	     WebElement Finishbutton = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium cart_button']"));
	     Finishbutton.click();	
	     Thread.sleep(1500);
	     WebElement logoutdropDown = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	     logoutdropDown.click();	
	     Thread.sleep(1500);
	     WebElement logoutbutton = driver.findElement(By.xpath("//a[text() = 'Logout']"));
	     logoutbutton.click();	
	     Thread.sleep(1500);
	
        Thread.sleep(2500);
        WebElement Username1 = driver.findElement(By.xpath("//input[@id ='user-name']"));
 		Username1.sendKeys("locked_out_user");
 		Thread.sleep(1000);
 		WebElement Password1 = driver.findElement(By.xpath("//input[@id ='password']"));
 		Password1.sendKeys("secret_sauce");
 		Thread.sleep(1000);
 		WebElement LoginButton1 = driver.findElement(By.xpath("//input[@id ='login-button']"));
 		LoginButton1.click();
 		Thread.sleep(1000);
 		WebElement errormessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
 		errormessage.click();
 		Thread.sleep(1000);
        System.out.println(errormessage.getText()); 
        Thread.sleep(2500);
 		driver.close() ; 
	  			
	}

}
