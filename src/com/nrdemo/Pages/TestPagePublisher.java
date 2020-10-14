package com.nrdemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPagePublisher {
	
	WebDriver driver;
	
	public TestPagePublisher(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//*[text()='Hero Image Test']")
	WebElement heroImagetest;
	
	public void heroImagePublisherTest(){
		
		if (heroImagetest.isDisplayed()) {
			System.out.println("Publisher test pass");
		}
		else
			System.out.println("Publisher test fail");
	}

}
