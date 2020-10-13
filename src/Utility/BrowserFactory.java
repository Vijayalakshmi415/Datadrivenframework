package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	 static WebDriver driver;
	 
	 public static WebDriver startBrowser(String browserName,String url)
	 {
		 
		 if(browserName.equals("firefox"))
		 {
			 driver=new FirefoxDriver();
		 }
		 else if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		 else if (browserName.equalsIgnoreCase("IE")) {
				driver=new InternetExplorerDriver();
			}
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get(url);
		 
		 return driver;
	 }

}
