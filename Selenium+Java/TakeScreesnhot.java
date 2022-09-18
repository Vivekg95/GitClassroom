package takeScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;

import Driver.DriverForAutomation;

import java.io.*;
import org.openqa.selenium.*;

public class TakeScreesnhot {
	
    public static void main(String args[]) throws IOException {
       
    	System.setProperty("webdriver.chrome.driver",DriverForAutomation.updatedchromeDriver096);
    	 WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/documentation/webdriver/browser_manipulation/");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshot/TakeScreesnhot90"));
        driver.quit();
    }
}
  