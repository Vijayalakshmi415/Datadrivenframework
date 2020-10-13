/**
 * 
 */
package com.nrdemo.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.nrdemo.Pages.LoginPage;

/**
 * @author vijayalakshmi B
 * @param <Loginpage>
 *
 */
public class VerifyNrdemoLogin {
	
	@Test
	public void verifyValidLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://nextrow-author.adobesandbox.com/libs/granite/core/content/login.html");
		
		LoginPage login=new LoginPage(driver);
		login.loginToNrdemo("admin", "jaP#uv+QAp9l");
		
		driver.quit();
		
	}
	
}
