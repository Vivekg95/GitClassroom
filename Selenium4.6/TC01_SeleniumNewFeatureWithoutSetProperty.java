package Selenium46.Selenium46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.testng.annotations.Test;

public class TC01_SeleniumNewFeatureWithoutSetProperty {
	
	@Test
	public  void runTest() {
		String cPath=SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.out.println(cPath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/insertion-sort/");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
