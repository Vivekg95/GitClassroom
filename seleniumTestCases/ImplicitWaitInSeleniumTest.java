package seleniumTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Driver.DriverForAutomation;

public class ImplicitWaitInSeleniumTest {

	/*
	 * Element Present checks if the element is present or not in the HTML body, it
	 * does not care about whether the element is in hidden
	 * state(style="display:none;) or not. Element Visible checks whether element is
	 * in visible state or not, if element is in hidden state(style="display:none;)
	 * then it will return false or exception.
	 */

	WebDriver driver;

	@BeforeClass
	public void setUpInfo() {
		System.setProperty("webdriver.chrome.driver", DriverForAutomation.updatedchromeDriver105);
		// Initialize webdDiver
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * Action class.
	 */
	@Test
	public void action() throws Exception {

		// select dropdown
		try {
			WebElement dropdown = driver.findElement(By.xpath(
					"//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
		} catch (Exception ex) {
			System.out.println("1.Ten" + ex.getMessage());
		}

		try {
			WebElement element = driver
					.findElement(By.xpath("//span[text()='Hello. Sign in' or text()='Account & Lists']"));
			element.click();
		} catch (Exception ex) {
			System.out.println("2.Ten" + ex.getMessage());
		}
	}

	@AfterClass
	public void quitBrowser() {

		driver.quit();
	}

}
