package selenium4;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Selenium 4.0 features.
 * <p>
 * Take screenshot of a web element
 * </p>
 * <p>
 * Open tab in same window
 * </p>
 * <p>
 * We can use 'FileHandler' instead of 'FileUtils'.
 * </p>
 * 
 * @author Vivek Kumar
 *
 */
public class SeleniumNewFeaturesVersion4 {

	WebDriver driver;

	@BeforeClass
	public void setUpInfo() {
		System.setProperty("webdriver.chrome.driver", DriverForAutomation.updatedchromeDriver105);
		// Initialize webdDiver
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// implicit wait
		driver.manage().window().maximize();
	}

	/**
	 * Take screenshot of web element.
	 * 
	 * @throws Exception Exception thrown
	 */
	@Test
	public void takeScreenshotOfWebElement() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']"));
		File file = ele.getScreenshotAs(OutputType.FILE);
		File destfile = new File("logo.png");

		// Instead of fileUtils, it is fileHandler
		FileHandler.copy(file, destfile);

	}

	/**
	 * Open Two Tab In Same Window.
	 * 
	 * @throws Exception Exception thrown
	 */
	@Test
	public void openTwoTabInSameWindow() throws Exception {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//div[@id='nav-search-dropdown-card']"));

		// Get screenshot of web element
		File file = ele.getScreenshotAs(OutputType.FILE);

		// Copy screenshot as specific location
		File destfile = new File("logo.png");

		// Instead of fileUtils, it is fileHandler
		FileHandler.copy(file, destfile);

		// Get height, width
		System.out.println("Height is = " + ele.getRect().getDimension().getHeight());
		System.out.println("Width is = " + ele.getRect().getDimension().getWidth());

	}

	@AfterClass
	public void quitBrowser() {

		driver.quit();
	}
}
