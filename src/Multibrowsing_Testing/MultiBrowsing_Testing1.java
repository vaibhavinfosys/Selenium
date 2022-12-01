package Multibrowsing_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class MultiBrowsing_Testing1 {
	@Parameters("browsername")
	@Test
	public void TC(String browsername) {
		WebDriver driver=null;
	
	   if(browsername.equals("chrome")) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
		      driver=new ChromeDriver();
	  }
	   
	   else if(browsername.equals("firefox")) {
		   
		   System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	         driver=new FirefoxDriver();
		   
	   }
	            driver.get("https://www.google.com/");
	   
}
}