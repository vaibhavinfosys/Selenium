package page_factory_without_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/accounts/login/");
        //give Globle wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().window().maximize();
        
        //create object of POM InstagramLogin1Page
        InstagramLogin1Page page1=new InstagramLogin1Page(driver);
        page1.enterUN();
        page1.enterPwd();
        page1.clickOnLoginButton();
        
        //create object of POM InstagramLogin2Page
        InstagramLogin2Page page2=new InstagramLogin2Page(driver);
        page2.clickOnNoteNow();
        
        //create object of POM 
        InstagramLogin3page page3=new InstagramLogin3page(driver);
        page3.clickOnNoteNow();
        
        //create object of POM InstagramProfileImagePage
        InstagramProfileImagePage profImg=new InstagramProfileImagePage(driver);
        profImg.imgClick();
        
        //create object of POM InstagramClickOnProfilePage
        InstagramClickOnProfilePage clickProf=new InstagramClickOnProfilePage(driver);
        clickProf.profileClick();
        
        //create object of POM InstagranHomePage
        InstagranHomePage hp=new InstagranHomePage(driver);
        hp.verifyUserId();
        
	}

}
