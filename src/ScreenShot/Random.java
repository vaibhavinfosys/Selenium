package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Random {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        //To maximize the window
        driver.manage().window().maximize();
        //use randomString class
        String random = RandomString.make();
        Thread.sleep(2000);
        
        // typecast interface
        TakesScreenshot ts=(TakesScreenshot)driver;
        Thread.sleep(2000);
        //use getScreenShotAs()
                  File src = ts.getScreenshotAs(OutputType.FILE);
                  Thread.sleep(2000);
                  
                  //give the path
                  File dest=new File("C:\\Users\\DELL PC\\Desktop\\java tutorial\\"+random+".png");
                  Thread.sleep(2000);
                  
       //move from src to dest
                  Files.copy(src, dest);
	}

}
