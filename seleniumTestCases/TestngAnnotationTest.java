package seleniumTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Driver.DriverForAutomation;

public class TestngAnnotationTest {
	
	
	/*
	 * Create constructor
	 */
	public  TestngAnnotationTest(){
	
	System.setProperty("webdriver.chrome.driver",DriverForAutomation.updatedchromeDriver105);
	}
	//Declare webDrivervariables
	WebDriver driver;
	
	@Test(description="Initialize webdriver",groups="TestNgAnnotaion")
	public void initializeDriver() {
	
	//Initialize webdDiver
	 driver=new ChromeDriver();
	}
	
	@Test(description="Launch URL",priority=1,groups="TestNgAnnotaion")
	public void launchUrl() {
	
	driver.get("https://www.amazon.in/");
	//implicit wait
	driver.manage().window().maximize();
	}
	

	@Test(description="Perform action",priority=2,groups="TestNgAnnotaion")
	public void performAction() {
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	try {
	WebElement element=driver.findElement(By.xpath("//span[text()='Hello. Sign in' or text()='Account & Lists']"));
	element.click();
	List<WebElement> link=driver.findElements(By.tagName("a"));
	Reporter.log("Size is "+link.size());
	}catch(ArithmeticException ex) {
		Reporter.log("Catch exception 1: "+ex.getMessage());
		WebElement element=driver.findElement(By.xpath("//span[text()='Hello. Sign in' or text()='Account & Lists']"));
		Reporter.log("Message1 is Vivek: "+ex.getMessage());
		
	}
	catch( Exception ex2) {
		Reporter.log("Catch exception 2: "+ex2.getMessage());
		
		Reporter.log("Message2 is Vivek: "+ex2.getMessage());
		
	}
	}
	
	@Test(description="Quit Browser",priority=3,enabled=true,groups="TestNgAnnotaion")
	public void quitBrowser() {
	
	driver.quit();
	}
	

}
