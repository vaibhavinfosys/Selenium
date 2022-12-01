package POM_with_PageFactory_withoutDDF4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_with_pageFactory_withoutDDF.KiteHomePage;
import POM_with_pageFactory_withoutDDF.KiteLogin1Page;
import POM_with_pageFactory_withoutDDF.KiteLogin2Page;

public class KiteTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        //give Globle wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        
        //create object of POM class1
        KiteLogin1Page page1=new KiteLogin1Page(driver);
        page1.enterUsername();
        page1.enterPassword();
        page1.clickOnLoginButton();
        
        //create object of POM class2
        KiteLogin2Page page2=new KiteLogin2Page(driver);
           page2.enterPin();
           page2.clickOnContinueButton();
        
        
        //create object of POM class3(that is home page)
           KiteHomePage homepage=new KiteHomePage(driver);
           homepage.verifyUserId();
        
        
        
        
        
        
	}


}
