package com.nrdemo.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nrdemo.Pages.LoginPageNew;
import com.nrdemo.Pages.SitesPage;
import com.nrdemo.Pages.TestPage;

import Utility.BrowserFactory;

public class VerifyHeroImageComponent {
	
	@Test
	public void verifyHeroImageComponent() throws Exception {
		
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://nextrow-author.adobesandbox.com/libs/granite/core/content/login.html");
		
		SitesPage sitesPage=PageFactory.initElements(driver, SitesPage.class);
		TestPage testPage=PageFactory.initElements(driver, TestPage.class);
		LoginPageNew loginPage=PageFactory.initElements(driver, LoginPageNew.class);
		
		loginPage.loginNrdemo("admin", "jaP#uv+QAp9l");
		
		sitesPage.openTestPage();
		testPage.dragAndDropHeroImageComponent();
		testPage.authorHeroImageComponent();
		}
}
