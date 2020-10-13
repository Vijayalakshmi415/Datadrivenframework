package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	   
    WebDriver driver;
   
//    @BeforeMethod
//    public void run()
//    {
//     }
    @Test(dataProvider="loginData")
    public void login(String username,String password) throws Exception
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.get("https://nextrow-author.adobesandbox.com/libs/granite/core/content/login.html");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit-button")).click();
        Thread.sleep(3000);
        //validation
        Assert.assertTrue(driver.getTitle().contains("AEM Start"), "User able to login-Valid credentials");
        System.out.println("User not able to login-InValid credentials");
    }
   
    @DataProvider(name="loginData")
    //2D array with object data type
    public Object[][] passData()
    {
        ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\vijayalakshmi B\\git\\Datadrivenframework\\TestData\\testData.xlsx");
        int rows=config.getRowCount(0);
       
        Object[][] data=new Object[rows][2];
       
        for(int i=0;i<rows;i++)
        {
            data[i][0]=config.getData(0, i, 0);//user name
            data[i][1]=config.getData(0, i, 1);//password
        }
        return data;
        }
  
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    }
}
