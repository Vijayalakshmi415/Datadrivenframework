package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactUsFormTest {
	
	WebDriver driver;
    @BeforeTest
    public void run()
    {
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    }
    @Test(dataProvider="contactUs") 
    public void contactUs(String firstname,String preference,String lastname,String email,String text,String phone) throws Exception
    {
    	driver.get("https://nextrow-publish.adobesandbox.com/content/nr_finance/us/en/contact-us.html");
    	//publish the page
    	driver.findElement(By.id("first_name")).sendKeys(firstname);
    	//drop down handling
    	Select sel = new Select(driver.findElement(By.id("preference")));
    	sel.selectByVisibleText(preference);
    	driver.findElement(By.id("last_name")).sendKeys(lastname);
    	driver.findElement(By.id("email")).sendKeys(email);
    	driver.findElement(By.id("textarea")).sendKeys(text);
    	driver.findElement(By.id("phone")).sendKeys(phone);  
    	driver.findElement(By.name("submit")).click();
    	
    	//Validation
    	Assert.assertTrue(driver.getTitle().contains("ContactUs"), "Page title verified-Submission UnSuccessful");
    	System.out.println("Page title verified-Successful submission");
    
    }
    
    @DataProvider(name="contactUs")
    public Object[][] formData()
    {
    	ExcelDataConfig eData=new ExcelDataConfig("C:\\Users\\vijayalakshmi B\\git\\Datadrivenframework\\TestData\\ContactUsFormData.xlsx");
    	int rows=eData.getRowCount(0);
    	
    	Object[][] data=new Object[rows][5];
    	
    	for(int i=0;i<rows;i++)
        {
            data[i][0]=eData.getData(0, i, 0);//firstname
            data[i][1]=eData.getData(0, i, 1);//preference
            data[i][2]=eData.getData(0, i, 2);//lastname
            data[i][3]=eData.getData(0, i, 3);//email
            data[i][4]=eData.getData(0, i, 4);//text
            data[i][5]=eData.getData(0, i, 5);//phone
        }
        return data;
        
    }
   
}
