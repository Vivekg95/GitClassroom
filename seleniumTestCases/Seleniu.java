package seleniumTestCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Driver.DriverForAutomation;

public class Seleniu {
	public static WebDriver driver=null;

	//scroll down to page
	
	public static void scrollIntoview(WebElement myelement5, WebDriver driver) {
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", myelement5);
	}
	//main execution starts from here
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",DriverForAutomation.updatedchromeDriver);
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.navigate().to("https://amazon.in");
		//driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Amazon.in")) {
			System.out.println("title matches");
		}
		else {
			System.out.println(title);
		}
		
		String tagname=" ";
		tagname=driver.findElement(By.cssSelector("#desktop-grid-1-D1")).getText();
		System.out.println(tagname);
		WebElement category=driver.findElement(By.cssSelector("#searchDropdownBox"));
		Actions action=new Actions(driver);
		action.moveToElement(category).perform();
		Thread.sleep(2000);
		
	
		
		WebElement books=driver.findElement(By.cssSelector("#nav-search-dropdown-card"));
		action.moveToElement(books);
		action.click();
		action.perform();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("twotabsearchtextbox")).click();
		Thread.sleep(2000);
		
		WebElement myelement=driver.findElement(By.id("twotabsearchtextbox"));
		myelement.sendKeys("John Grisham");
		
		
	
		driver.findElement(By.className("nav-input")).click();
		
		
		driver.findElement(By.className("s-image")).click();
		
		//Shift the tab control
		Set<String> handles=driver.getWindowHandles();
		String winHandle1=driver.getWindowHandle();
		handles.remove(winHandle1);
		
		String winHandle=handles.iterator().next();
		String winHandle2=" ";
		if(winHandle !=winHandle1) {
			winHandle2=winHandle;
			driver.switchTo().window(winHandle2);
			System.out.println(winHandle2);
		}
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();
		
		//LogIn MibileNumber or emailId
		
		WebElement myelement2=driver.findElement(By.id("ap_email"));
		myelement2.sendKeys("7083122952");
		driver.findElement(By.className("a-button-input")).click();
		
		//Password
		WebElement myelement3=driver.findElement(By.id("ap_password"));
		myelement3.sendKeys("708312@vk");
		driver.findElement(By.className("a-button-input")).click();
		
		//Add new address
		WebElement myelement4=driver.findElement(By.id("enterAddressFullName"));
		myelement4.sendKeys("Vivek Kumar");
		
		//
		WebElement myelement6=driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use')]"));
		scrollIntoview(myelement6,driver);
		Thread.sleep(2000);
		
		//click on the conditions of use
		driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use')]")).click();
		driver.navigate().to("https://www.amazon.in/gp/help/customer/display.html/ref=ox_shipaddress_condition_of_use?ie=UTF8&nodeId=200545940&pop-up=1");
		driver.manage().window().maximize();
		driver.getTitle();
		
		
		
		
		
		
		
				
		

	}
	
}
