/**
 * 
 */
package com.nrdemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author vijayalakshmi B
 *
 */
public class LoginPageNew {
	
	WebDriver driver;
	
	public LoginPageNew(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	
	@FindBy(id="submit-button")
	WebElement submit;
	
	public void loginNrdemo(String uid,String pwd)
	{
		username.sendKeys(uid);
		password.sendKeys(pwd);
		submit.click();
	}

}
