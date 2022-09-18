package seleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Driver.DriverForAutomation;

/**
 * Verify Explicit wait in selenium.
 * 
 * @author Vivek Kumar
 * @version 1.0.0
 */
public class ExplicitWaitInSeleniumTest {

	/*
	 * <p> By using the Explicit Wait command, the WebDriver is directed to wait
	 * until a certain condition occurs before proceeding with executing the
	 * code.</p>
	 * 
	 * <p> Setting Explicit Wait is important in cases where there are certain
	 * elements that naturally take more time to load. If one sets an implicit wait
	 * command, then the browser will wait for the same time frame before loading
	 * every web element. This causes an unnecessary delay in executing the test
	 * script. </p>
	 * 
	 * <p> Explicit wait is more intelligent, but can only be applied for specified
	 * elements. However, it is an improvement on implicit wait since it allows the
	 * program to pause for dynamically loaded Ajax elements.</p>
	 * 
	 * <p>In order to declare explicit wait, one has to use
	 * “ExpectedConditions”.</p>
	 * 
	 * <p>The Explicit Wait is more advanced in its functioning. It instructs
	 * WebDriver to pause a test until a predetermined condition is fulfilled.</p>
	 */

	// Declare variable
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
	public void explicitWait() {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);

		/*
		 * Will wait for 30 seconds before throwing 'TimeoutException ' if element is
		 * not found.If element is found, it will move to next step.
		 */
		webDriverWait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[text()='Hello. Sign in' or text()='Account & Lists']")));
		WebElement element = driver
				.findElement(By.xpath("//span[text()='Hello. Sign in' or text()='Account & Lists']"));
		element.click();

		// Find and click element
		WebElement element2 = driver.findElement(By.xpath("//input[@id='ap_email']"));
		webDriverWait.until(ExpectedConditions.visibilityOf(element2));

		/*
		 * alertIsPresent: Wait for alert to be present.
		 */
		try {
			webDriverWait.until(ExpectedConditions.alertIsPresent());
		} catch (NoAlertPresentException ex) {
			System.out.println("No alert is present " + ex.getMessage());
		}

		/*
		 * elementToBeClickable: An expectation for checking an element is visible and
		 * enabled such that you can click it..
		 */
		try {
			webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ap_email']")));
		} catch (StaleElementReferenceException ex) {
			System.out.println("No alert is present " + ex.getMessage());
		}

		/*
		 * elementToBeClickable: An expectation for checking an element is visible and
		 * enabled such that you can click it.
		 */
		try {
			webDriverWait.until(ExpectedConditions.elementToBeClickable(element2));
		} catch (StaleElementReferenceException ex) {
			System.out.println("No alert is present " + ex.getMessage());
		}
	}

	@AfterClass
	public void quitBrowser() {

		driver.quit();
	}

}
