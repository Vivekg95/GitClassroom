package seleniumTestCases;

import java.io.PrintStream;
import java.util.ArrayList;

import org.apache.xml.utils.res.LongArrayWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Driver.DriverForAutomation;
import pageObjectRepository.AmazonPageRepository;

public class WebDriverMethodTest {
	
	//Declare webDrver
	public static WebDriver driver=null;
	
	//Initialize repository
	AmazonPageRepository amazonPageRepository=new AmazonPageRepository();
	
	public void logWrapper(Object obj) {
		
		System.out.println( obj.toString());
	
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",DriverForAutomation.chromeDriver);
		
		//Initialize driver
		driver=new ChromeDriver();
		WebDriverMethodTest web=new WebDriverMethodTest();
		
		
		/*
		 * 1.Close browser if there are single tab..Else it will close, single open tab
		 */
		//Close driver
		driver.close();
		
		
		/*
		 * 2.findElement()
		 */
		driver.findElement(By.className("//div//Amazon.com"));
		driver.findElement(By.cssSelector("html"));
		driver.findElement(By.id("selectid"));
		driver.findElement(By.linkText("yocksa"));
		driver.findElement(By.name("mehta&sons"));
		driver.findElement(By.partialLinkText("palink"));
		driver.findElement(By.tagName("tasgToCover"));
		driver.findElement(By.xpath("//div[contains(text(),'google.com')]"));
		driver.findElements(By.id("id"));
		
		
		/*
		 * 3.Current url
		 */
	    String url= driver.getCurrentUrl();
	    System.out.println(url);
	    
	    //Initialize variables
	    int i=10;
	    
	    //Initialize arrayList
	    ArrayList<String> list=new ArrayList<>();
	    list.add("yts");
	    list.add(url);
	    
	    //Print
	    web.logWrapper(url);
	    web.logWrapper(i);
	    web.logWrapper(list);
	    
	     driver.getClass();
	     driver.getPageSource();
		
	}
}
