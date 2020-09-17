package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
		public WebDriver driver;
		public void login() {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Login script
			driver.get("https://nextrow-author.adobesandbox.com/libs/granite/core/content/login.html");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("jaP#uv+QAp9l");
			driver.findElement(By.id("submit-button")).click();
			String expectedTitle= "AEM Start";
			String actualTitle=driver.getTitle();
			if(expectedTitle.equalsIgnoreCase(actualTitle))
				System.out.println("Login test SUCCESS");
			else 
				System.out.println("Login test NOT SUCCESS");
			}
			
			public void publishTest() {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			//Publisher
			driver.get("https://nextrow-publish.adobesandbox.com/content/nr_finance/language-masters/en/testpage.html");
		}
	}

