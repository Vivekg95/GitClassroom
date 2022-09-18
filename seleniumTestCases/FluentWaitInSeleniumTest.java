package seleniumTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Driver.DriverForAutomation;

public class FluentWaitInSeleniumTest {

	/*
	 * <p> The Fluent Wait is an advancement on the Explicit Wait. Using it, testers
	 * can define a specific condition and the frequency for which WebDriver should
	 * check for the condition to appear in a particular length of time. </p>
	 * 
	 * <p> Let’s say the website under test includes some elements that load
	 * dynamically. The tester knows it takes a total of 5 seconds to load, not
	 * more. But it can become visible anytime between zero to five seconds.</p>
	 * 
	 * <p> Fluent Wait looks for a web element repeatedly at regular intervals until
	 * timeout happens or until the object is found.</p>
	 * 
	 * <p> While using Fluent Wait, it is possible to set a default polling period
	 * as needed. The user can configure the wait to ignore any exceptions during
	 * the polling period. </p>
	 * 
	 * <p> It also defines how frequently WebDriver will check if the condition
	 * appears before throwing the “ElementNotVisibleException”.</p>
	 */

	// Declare driver
	WebDriver driver;

	@BeforeClass
	public void setupInfo() {
		System.setProperty("webdriver.chrome.driver", DriverForAutomation.updatedchromeDriver105);
		// Initialize webdDiver
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// implicit wait
		driver.manage().window().maximize();
	}

	@Test
	public void fluentWait() {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(3, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		/*
		 * Will wait for 30 seconds before throwing 'TimeoutException ' if element is
		 * not found.If element is found, it will move to next step.
		 */

		WebElement element = driver
				.findElement(By.xpath("//span[text()='Hello. Sign in' or text()='Account & Lists']"));
		element.click();

		// Find and click element
		WebElement element2 = driver.findElement(By.xpath("//input[@id='ap_email']"));
		wait.until(ExpectedConditions.visibilityOf(element2));

	}

	@AfterClass
	public void quitBrowser() {

		driver.quit();
	}
}
