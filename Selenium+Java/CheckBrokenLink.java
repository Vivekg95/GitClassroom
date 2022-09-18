package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Driver.DriverForAutomation;

public class CheckBrokenLink {
	
	public static void checkBrokenLinks(String url) {
		int count =0;
		try {
		URL urls=new URL(url);
	    HttpURLConnection httpURLConnection=(HttpURLConnection)urls.openConnection();
	    httpURLConnection.setConnectTimeout(5000);
	    httpURLConnection.connect();
	    
	    if(httpURLConnection.getResponseCode()>=400) {
	    	System.out.println(url + " is a broken link  AND response message is = "+httpURLConnection.getResponseMessage());
	    	count++;
	    }else {
	    	System.out.println(url+ " "+httpURLConnection.getResponseMessage() );
	    }
			
		}catch(Exception ex){
			
		}
		System.out.println("total broken link is = "+count);
	}

	 public static void main(String args[]) throws IOException {
	       
	    	System.setProperty("webdriver.chrome.driver",DriverForAutomation.updatedchromeDriver102);
	    	 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        
	        List<WebElement> list=driver.findElements(By.tagName("a"));
	        System.out.println("No of links are = "+list.size());
	        
	        List<String> urlList=new ArrayList<String>();
	        
	        for(WebElement e:list) {
	        	String url=e.getAttribute("href");
	        	checkBrokenLinks(url);
	        	//urlList.add(url);
	        }
	     
	        driver.quit();
	    }
}
