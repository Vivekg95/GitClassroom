package seleniumTestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Driver.DriverForAutomation;

public class BeforeAndAfterTestngAnnotationTest {
	
	//Declare webDrivervariables
	WebDriver driver;
	SoftAssert ss;
	
	@BeforeClass(description="Set and Initialize webdriver.Launch URL")
	public void testSetup(){
	
	System.setProperty("webdriver.chrome.driver",DriverForAutomation.updatedchromeDriver105);
	//Initialize webdDiver
	driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	//implicit wait
	driver.manage().window().maximize();
	ss= new SoftAssert();
	}
	
	@BeforeMethod
	public void waitForPageToLoad() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

	@Test(description="Perform and click action")
	public void performAction() {
	try {
	WebElement element=driver.findElement(By.xpath("//span[text()='Hello. Sign in' or text()='Account & Lists']"));
	element.click();
	List<WebElement> link=driver.findElements(By.tagName("a"));
	Reporter.log("Size is "+link.size());
	ss.assertEquals("qq", "qq");
	}catch(ArithmeticException ex) {
		Reporter.log("Catch exception 1: "+ex.getMessage());
		WebElement element=driver.findElement(By.xpath("//span[text()='Hello. Sign in' or text()='Account & Lists']"));
		Reporter.log("Message1 is Vivek: "+ex.getMessage());
		
	}
	catch( Exception ex2) {
		Reporter.log("Catch exception 2: "+ex2.getMessage());
		
		Reporter.log("Message2 is Vivek: "+ex2.getMessage());		
	}
	ss.assertAll();
	}
	
	@AfterMethod(description="get current url")
	public void postLoginPage() {
		System.out.println(driver.getCurrentUrl().toString());
	}
	
	@AfterClass(description="Quit Browser")
	public void quitBrowser() {
	
	driver.quit();
	}
}
