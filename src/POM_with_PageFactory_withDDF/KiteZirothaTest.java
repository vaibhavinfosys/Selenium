package POM_with_PageFactory_withDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class KiteZirothaTest {
	public static void main(String[] args) throws Throwable {
		
		  FileInputStream fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\java tutorial\\mahaguru.xlsx");
	        Sheet forUsernameID = WorkbookFactory.create(fis).getSheet("sheet1");
	        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        //give global wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        
      
           //create object of POM class1
        String username = forUsernameID.getRow(1).getCell(0).getStringCellValue();
        
        String password = forUsernameID.getRow(1).getCell(1).getStringCellValue();
        
        KiteZirothaLogin1Page page1=new KiteZirothaLogin1Page(driver);
        page1.enterUserName(username);
        page1.enterPassword(password);
        page1.clickOnLoginButton();
        
        //Create object of POM class2
        String pin = forUsernameID.getRow(1).getCell(2).getStringCellValue();
        
        KiteZirothaLogin2Page page2=new KiteZirothaLogin2Page(driver);
        page2.enterPin(pin);
        page2.clickOnContinueButton();
        
        //Create object of POM class3
        String expID = forUsernameID.getRow(1).getCell(0).getStringCellValue();
        
        KiteZirothaHomePage page3=new KiteZirothaHomePage(driver);
        page3.verifyID(expID);
        
        
        
        
        
        
        
        
	}

}
