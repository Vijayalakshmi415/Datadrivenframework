package com.nrdemo.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nrdemo.Pages.LoginPageNew;

import Utility.BrowserFactory;

public class VerifyValidLogin {
	
	@Test
	public void checkValidUser()
	{
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://nextrow-author.adobesandbox.com/libs/granite/core/content/login.html");
		
		//created object using page factory
		LoginPageNew loginPage=PageFactory.initElements(driver, LoginPageNew.class);
		
		loginPage.loginNrdemo("admin", "jaP#uv+QAp9l");
	}
}
