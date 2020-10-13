package com.nrdemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SitesPage {
	
	WebDriver driver;
	
	public SitesPage(WebDriver ldriver) {
	this.driver=ldriver;
	}
	
	@FindBy(xpath = "//*[@id=\"globalnav-start-home-collection\"]/coral-masonry-item[2]/div")
	WebElement sites;
	
	@FindBy(xpath= "//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column/coral-columnview-column-content/coral-columnview-item[13]")
	WebElement NRfinance;
	
	@FindBy(xpath="//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[2]/coral-columnview-column-content/coral-columnview-item[1]")
	WebElement languageMaster;
	
	@FindBy(xpath="//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[3]/coral-columnview-column-content/coral-columnview-item[1]")
	WebElement english;
	
	@FindBy(xpath="//*[@id=\"granite-shell-content\"]/div[2]/div/div[2]/coral-columnview/coral-columnview-column[4]/coral-columnview-column-content/coral-columnview-item[7]/coral-columnview-item-thumbnail/img")
	WebElement testPage;
	
	@FindBy(xpath="//button[@type='button' and @icon='edit']")
	WebElement editButton;
	
	public void openTestPage()
	{
		sites.click();
		NRfinance.click();
		languageMaster.click();
		english.click();
		testPage.click();
		editButton.click();
	}

}
