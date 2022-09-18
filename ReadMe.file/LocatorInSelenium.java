package takeScreenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Driver.DriverForAutomation;

public class LocatorInSelenium {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",DriverForAutomation.updatedchromeDriver104);
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   //By className
	   try {
		   
		   //Handle login window
		   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		   Thread.sleep(4000);
		   
		   //send keys
		   driver.findElement(By.className("_3704LK")).sendKeys("poco m4 pro");
		   Thread.sleep(4000);
		   
		 //Click search button
		   driver.findElement(By.className("L0Z3Pu")).click();
		   Thread.sleep(4000);
		   
		   //Click by linkText
		   driver.findElement(By.linkText("Become a Seller")).click();
		   Thread.sleep(4000);
		   
		   //Navigate to back
		   driver.navigate().back();
		   Thread.sleep(4000);
		   
		   //Switch to amzon
		   driver.get("https://www.amazon.in/ref=nav_logo");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   //Send keys by id
		   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("poco m4 pro");
		   Thread.sleep(4000);
		   
		   
	   }catch(NoSuchElementException ex) {
		  System.out.println(ex.getMessage());
	   }
	   Thread.sleep(4000);
	 
	   
/*	   driver.findElement(By.cssSelector("axe"));
	 
	   driver.findElement(By.name("ss"));
	   driver.findElement(By.partialLinkText("ss"));
	   driver.findElement(By.tagName("ss"));
	   */
	   
	   driver.quit();
	}
	
	

}
