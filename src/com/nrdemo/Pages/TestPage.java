package com.nrdemo.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TestPage {
	
	WebDriver driver;
	
	public TestPage(WebDriver ldriver) {
	this.driver=ldriver;
	}
	
	@FindBy(xpath="//button[@title='Toggle Side Panel']")
	WebElement openSidepanel;
	
	@FindBy(xpath="//*[@id=\"OverlayWrapper\"]/div[2]/div[3]")
	WebElement parsys;
	
	@FindBy(xpath="//*[@title='Insert component']")
	WebElement insertComponent;
	
	@FindBy(xpath="//input[@class='coral3-Textfield coral-DecoratedTextfield-input coral3-Search-input']")
	WebElement enterKeyWord;
	
	@FindBy(xpath="//*[text()='Hero Image' and @value='/apps/weretail/components/content/heroimage']")
	WebElement heroImage;
	
	@FindBy(xpath="//span[text()='Hero Image']")
	WebElement heroImageText;
	
	@FindBy(xpath="//*[@id=\"EditableToolbar\"]/button[1]")
	WebElement configure;
	
	@FindBy(xpath="//img[@class='cq-dd-image' and @src='/content/dam/abbvie/rsz_isaac-smith-ij7h-m4nj18-unsplash.jpg/_jcr_content/renditions/cq5dam.thumbnail.319.319.png?ch_ck=1601471862000']")
	WebElement image;
	
	@FindBy(xpath="//span[@class='cq-FileUpload-label']")
	WebElement dropImage;
	
	@FindBy(xpath="//*[text()='Properties']")
	WebElement properties;
	
	@FindBy(name="./heading")
	WebElement heading;
	
	@FindBy(name="./title")
	WebElement title;
	
	@FindBy(name="./buttonLabel")
	WebElement buttonLabel;
	
	@FindBy(xpath="//*[@id=\"coral-id-514\"]/coral-panel-content/div/div/div/div[4]/foundation-autocomplete/div/div/span/button")
	WebElement linkTo;
	
	@FindBy(xpath="//img[@class='foundation-collection-item-thumbnail' and @src='/content/aemboxplugin.thumb.48.48.png']")
	WebElement aemboxPlugin;
	
	@FindBy(xpath="//button[@class='granite-pickerdialog-submit coral3-Button coral3-Button--primary']")
	WebElement selectButton;
	
	@FindBy(xpath="//input[@name='./useFullWidth']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[@class='cq-dialog-header-action cq-dialog-submit coral3-Button coral3-Button--minimal' and @title='Done']")
	WebElement done;
	
	@FindBy(id="pageinfo-trigger")
	WebElement pageInfo;
	
	@FindBy(xpath="//button[@title='Publish Page']")
	WebElement publishpage;
	
	public void dragAndDropHeroImageComponent() throws Exception {
		//window handles
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String>i1=s.iterator();
		while(i1.hasNext())
		{
		String child_window=i1.next();
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		
		Thread.sleep(8000);	
		openSidepanel.click();
		parsys.click();
		insertComponent.click();
		enterKeyWord.sendKeys("hero");
		heroImage.click();
		
		}}}
	
	public void authorHeroImageComponent() throws Exception {
		heroImageText.click();
		configure.click();
		//drag and drop image
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(image, dropImage).build().perform();
		properties.click();
		heading.sendKeys("Hero Image Test");
		title.sendKeys("Test Title");
		buttonLabel.sendKeys("Test button");
		linkTo.click();
		aemboxPlugin.click();
		selectButton.click();
		checkbox.click();
		done.click();
		}
	
	public void publishTestPage() throws Exception
	{
		Thread.sleep(2000);
		pageInfo.click();
		Thread.sleep(2000);
		publishpage.click();
		Thread.sleep(2000);
	}

}
