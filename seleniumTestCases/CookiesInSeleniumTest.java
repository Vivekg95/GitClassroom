package seleniumTestCases;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Driver.DriverForAutomation;

public class CookiesInSeleniumTest {
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
	
	@Test
	public void cookies() {
		Set<Cookie> cok=driver.manage().getCookies();
		for(Cookie str :cok) {
			System.out.println("Cookies is= "+str.getValue());
		}
	}
	
	@AfterClass
	public void quitBrowser() {

		driver.quit();
	}
	
}
