package seleniumTestCases;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Driver.DriverForAutomation;

public class PrintFirst2Columns {
	
    public static void main(String args[]) throws IOException {
        
    	System.setProperty("webdriver.chrome.driver",DriverForAutomation.updatedchromeDriver104);
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
        driver.get("https://www.covid19india.org/");
        //WebElement element=driver.findElement(By.xpath("//div[text()='State/UT']"));
        
        //Get total no of rows
       //int row=driver.findElements(By.xpath("//div[@class='table-container']//div[contains(@class,'row')]")).size();
        try {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}catch(Exception ex) {
        	System.out.println(ex.getMessage());
        }
        
        List<WebElement> rowsDetails=driver.findElements(By.xpath("//div[@class='table-container']//div[contains(@class,'row')]"));
        System.out.println("Size of the rows is = "+rowsDetails.size());
        
        //Get total no of columns
        List<WebElement> coulmnDetails=driver.findElements(By.xpath("//div[@class='table-container']//div[contains(@class,'cell heading')]"));
        System.out.println("Size of the column is = "+coulmnDetails.size());
        
        for(int i=1;i<=coulmnDetails.size();i++) {
        	
        	String text=driver.findElement(By.xpath("(//div[@class='table-container']//div[contains(@class,'cell heading')]//div[text()])["+i+"]")).getText();
        	
        	
        	if(text.contains("State/UT")){
        		System.out.println("Column = '"+text +"' is at "+i+"th position.");
        		List<WebElement> stateNameDe=driver.findElements(By.xpath("//div[contains(@class,'row')]//div[contains(@class,'state-name')]"));
        		
        		for(int k=1;k<=stateNameDe.size();k++) {
        			int z=1;
        			
        		String stateName=driver.findElement(By.xpath("(//div[contains(@class,'row')]//div[contains(@class,'state-name')])["+k+"]")).getText();
        		
        		
        		String dynamicLocator="(//div[contains(@class,'row')]//div[contains(@class,'state-name') and text()= 'DYNAMICLOCATOR']/../following-sibling::div[@class='cell statistic'])["+z+"]";
        		
        		 String Confirmed=driver.findElement(By.xpath(dynamicLocator.replace("DYNAMICLOCATOR", stateName))).getText();
        		
        		 System.out.println("State or union territory = '"+stateName);
        		 System.out.println("'Confirmed' cases are = '"+Confirmed+"' .");
        		
        		}
        		  	     	
        	}
	
        }

        driver.quit();
    }

}
