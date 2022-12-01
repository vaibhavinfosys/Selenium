package POM_with_Pagefactory_WthoutDDF2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    //give Globle wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().window().maximize();
    
    //Create object of class 1
    GmailLogin1Page page1=new GmailLogin1Page(driver);
    page1.enterEmailId();
    page1.clickOnNextButton();
    
    //create object of class 2
    GmailLogin2Page page2=new GmailLogin2Page(driver);
    page2.enterPassword();
    page2.clickOnNextButton();
    
    //create object of class 3
    GmailLogin3Page page3=new GmailLogin3Page(driver);
    page3.clickOnLogoImg();
    
    //create object of class 4
    GmailLogin4VerifyPage page4=new GmailLogin4VerifyPage(driver);
    page4.verifyEmail();
    
    
    
    
    
    
    
    

}
}
