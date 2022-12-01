package POM_With_DDF_Using_TestNG1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import POM_With_DDF_Using_TestNG.KiteZirothaHomePageT;
import POM_With_DDF_Using_TestNG.KiteZirothaLogin1PageT;
import POM_With_DDF_Using_TestNG.KiteZirothaLogin2PageT;

public class KiteZirothaTestT {
	//Declare All useful member as Global
		FileInputStream fis;
		 Sheet sh;
		 WebDriver driver;
		 KiteZirothaLogin1PageT page1;
		 KiteZirothaLogin2PageT page2;
		  KiteZirothaHomePageT page3;
		 
		  
		  
		 
		
		
		@BeforeClass
		public void openBrowser() throws Throwable {
			 fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\java tutorial\\mahaguru.xlsx");
		        sh = WorkbookFactory.create(fis).getSheet("sheet1");
		       System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			     driver=new FirefoxDriver();
			    driver.get("https://kite.zerodha.com/");
		        //give global wait
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		        driver.manage().window().maximize();
		        
		       
		        
		    // To create object of all POM class
		         page1=new KiteZirothaLogin1PageT(driver);
		        
		        page2=new KiteZirothaLogin2PageT(driver);
		        
		        page3=new KiteZirothaHomePageT(driver);
		        
		        
		        
		       
		   }
		
		
		public  void takesnapShot(WebDriver webdriver,String fileWithPath) throws Throwable {
			
			 TakesScreenshot ts=((TakesScreenshot)webdriver);
			
			    File src = ts.getScreenshotAs(OutputType.FILE);
			        
			    File  dest= new File(fileWithPath);
			        
			        Files.copy(src, dest);
			     
			      
		}
		
		@BeforeMethod
		public void logInToApplication() {
			// Enter User name
			 String username = sh.getRow(1).getCell(0).getStringCellValue();
			 page1.enterUserName(username);
			 
			 //Enter password
			 String password = sh.getRow(1).getCell(1).getStringCellValue();
			 page1.enterPassword(password);
			 
			 //Click on login button
			 page1.clickOnLoginButton();
			 
			 //Enter pin
			 String pin = sh.getRow(1).getCell(2).getStringCellValue();
			 page2.enterPin(pin);
			 
			 //Click on continue button
			 page2.clickOnContinueButton();
	     }
		   @Test
		   public void varifyUserId() throws Throwable {
			   
			   this.takesnapShot(driver, "C:\\Users\\DELL PC\\Desktop\\www\\vaibhav3.png");
			   
			   Reporter.log("Running verify user ID",true);
			   String actID = page3.verifyID();
			   String expId=sh.getRow(1).getCell(0).getStringCellValue();
			   Assert.assertEquals(expId,actID,"Both are different TC is Failed");
			   
			   
		  }
		   @AfterMethod
		   public void logOutApplication() {
			   Reporter.log("Logout the aplication",true);
		   }
	     @AfterClass
	     public void closeBrowser() {
	    	 Reporter.log("close the Application",true);
	     }
}
