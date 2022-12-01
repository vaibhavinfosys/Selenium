package POM_with_PageFactory_WithoutDDF3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
    //give Globle wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().window().maximize();
	
//create object of POM class1
    ActitimeLoginPage page1=new ActitimeLoginPage(driver);
    page1.enterUserName();
    page1.enterPassword();
    page1.clickOnLoginButton();
    
    //create object of POM class2
    ActitimeMainPage page2=new ActitimeMainPage(driver);
    page2.Verify();
    
}
}
