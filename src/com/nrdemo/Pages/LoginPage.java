/**
 * 
 */
package com.nrdemo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author vijayalakshmi B
 *
 */
public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	By username=By.id("username");
	By password=By.id("password");
	By submit=By.id("submit-button");
	
	public void loginToNrdemo(String userid,String pwd) {
		
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(submit).click();
	}
	


}
