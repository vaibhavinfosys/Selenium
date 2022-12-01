package Upload_And_Downlod_File;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Download_File_Using_ChromeOptions_Class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL PC\\\\Downloads\\\\Java\\\\chromedriver_win32(version-104.0)\\\\chromedriver.exe");
	        String downloadFilePath="C:\\Users\\DELL PC\\Desktop\\www";
	        
	        Map<String, Object> prefsMap = new HashMap<String, Object>();
	        prefsMap.put("profile.default_content_settings.popups", 0);
	        prefsMap.put("download.default_directory",downloadFilePath );
	        
	        ChromeOptions option = new ChromeOptions();
	        option.setExperimentalOption("prefs",prefsMap);
	        option.addArguments("--test-type");
	        option.addArguments("--disable-extensions");
	        
	        WebDriver driver  = new ChromeDriver(option);
			  driver.get("https://www.seleniumhq.org/download/");
		  	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  	  driver.manage().window().maximize();
		  	  Thread.sleep(2000);
		  	  driver.findElement(By.linkText("64 bit Windows IE")).click();
		  	  System.out.println("Downloaded");
	
	}

}
