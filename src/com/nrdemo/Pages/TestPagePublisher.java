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
	
	@FindBy(xpath="//*[@src='/content/nr_finance/language-masters/en/testpage/_jcr_content/root/responsivegrid/addtocartimage.img.jpg/1602833468967.jpg']")
	WebElement addTocartImage;
	
	@FindBy(xpath="//*[text()='Explore to Finanacial']")
	WebElement imageDesciption;
	
	public void heroImagePublisherTest(){
		
		if (heroImagetest.isDisplayed()) {
			System.out.println("Publisher test pass");
		}
		else
			System.out.println("Publisher test fail");
	}

	public void imageWithAddtocartlinkPublisherTest(){
		
		if (imageDesciption.isDisplayed()) {
			System.out.println("Image With Add to cart link Publisher Test test pass");
			
		}
		else
			System.out.println("Image With Add to cart link Publisher test fail");
	}
}
