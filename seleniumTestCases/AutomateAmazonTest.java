package seleniumTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Driver.DriverForAutomation;
import pageObjectRepository.AmazonPageRepository;

public class AutomateAmazonTest {
	public static WebDriver driver=null;
	AmazonPageRepository amazonPageRepository=new AmazonPageRepository();
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",DriverForAutomation.updatedchromeDriver);
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.navigate().to(AmazonPageRepository.amazonLogInUrlXPath);

		driver.manage().window().maximize();
		driver.getTitle();
		
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(AmazonPageRepository.amazonLogInUrlXPath));
		action.click(element);
		action.perform();
		driver.close();
		
	
		
	}
	


}
