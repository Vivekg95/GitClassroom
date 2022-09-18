package seleniumTestCases;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import Driver.DriverForAutomation;

public class ImlicitAndExplict {
	
	@Test
	public  void mains() {
		System.setProperty("webdriver.chrome.driver",DriverForAutomation.updatedchromeDriver105);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//implicit wait
		driver.manage().window().maximize();
		
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
		
		WebDriverWait wait= new WebDriverWait(driver, 10);

		WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Hello. Sign in' or text()='Account & Lists']")));
		int size=driver.findElements(By.tagName("iframe")).size();
		element.sendKeys("testing");
		driver.close();
		driver.switchTo().frame(element);
		driver.switchTo().defaultContent();
		
		//Dropd
		Select objSelect = new Select(driver.findElement(By.id("Search-box")));
		objSelect.selectByValue("Automation Testing");
		assertEquals("a", "aa");
		Assert.assertEquals(true, true);
		SoftAssert softAssert=new SoftAssert();
		
		/**
		 * Fluent wait
		 */
		Wait<WebDriver> wait2=new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS);
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });
		
	}

}
