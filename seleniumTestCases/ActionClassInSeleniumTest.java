package seleniumTestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Driver.DriverForAutomation;

public class ActionClassInSeleniumTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUpInfo() {
		System.setProperty("webdriver.chrome.driver",DriverForAutomation.updatedchromeDriver105);
		//Initialize webdDiver
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");		
		//implicit wait
		driver.manage().window().maximize();
	}
	
	/**
	 * Action class.
	 */
	@Test
	public void action() throws Exception{
		
		//select dropdown
		WebElement dropdown=driver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']"));
		dropdown.click();
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//span[text()='Hello. Sign in' or text()='Account & Lists']"));
		element.click();
		Thread.sleep(2000);
		
		//Find and click element
		WebElement element2=driver.findElement(By.xpath("//input[@id='ap_email']"));
		action.moveToElement(element2).click().perform();
		
		//send text
		action.moveToElement(element2).sendKeys("ipsa@gmail.com").perform();
		
		//action.sendKeys(element, Keys.CLEAR).perform();
		
		//send text
		action.moveToElement(element2).sendKeys("ipsa@gmail.com").perform();
		element2.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE));
		Thread.sleep(2000);

	}
	
	@AfterClass
	public void quitBrowser() {

		driver.quit();
	}

}
