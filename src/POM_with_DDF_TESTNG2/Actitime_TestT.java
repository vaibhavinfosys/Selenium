package POM_with_DDF_TESTNG2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actitime_TestT {
	
	// declare globally 

	 FileInputStream fis;
	  Sheet sh ;
	  WebDriver driver;
	  Actitime_Login_PageT page1;
	  Actitime_HomePageT page2;
	  
         @BeforeClass()
        
         public void openBrowser() throws Throwable {
        	 
        	  fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\java tutorial\\Actitime credential.xlsx");
        	              sh = WorkbookFactory.create(fis).getSheet("sheet1");
        	             
        	             System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL PC\\\\Downloads\\\\Java\\\\chromedriver_win32(version-104.0)\\\\chromedriver.exe");
        			      driver = new ChromeDriver();
        			    driver.get("https://demo.actitime.com/login.do");
        		        //give global wait
        		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        		        driver.manage().window().maximize();
        	 
        		         // create object of POM class
        		         page1=new Actitime_Login_PageT(driver);
        		        
        		         page2=new Actitime_HomePageT(driver);
         }
         
         @BeforeMethod 
         public void logInToApplications() {
        	 // enter username
        	String username = sh.getRow(1).getCell(0).getStringCellValue();
        	
        	    page1.enterUsername(username);
        	    
        	    // enter password
        	    
        	    String password = sh.getRow(1).getCell(1).getStringCellValue();
        	    
        	    page1.enterPassword(password);
        	    
        	    // click on login button
        	    
        	    page1.clickOnloginButton();
        	 
         }
         
         @Test 
         
         public void verifyuserId() {
        	 
        	 Reporter.log("Running verify userText",true);
        	 
        	  String actUT = page2.verifyUserText();
        	  
        	  String expUT = sh.getRow(1).getCell(2).getStringCellValue();
        	  
        	  Assert.assertEquals(actUT, expUT,"both are different test case is fail");
        	   }
         
         @AfterMethod
         public void logOutApplication() {
        	 
        	 page2.logoutApplication();
        	 Reporter.log("Logout successfully",true);
         }
         
         @AfterClass
         public void closeBrowser() {
        	 driver.close();
        	 Reporter.log("Close the Application",true);
         }
         
}
