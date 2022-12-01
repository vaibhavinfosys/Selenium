package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        //To maximize the window
        driver.manage().window().maximize();
        
        // typecast interface
        TakesScreenshot ts=(TakesScreenshot)driver;
        //use getScreenShotAs()
                  File src = ts.getScreenshotAs(OutputType.FILE);
                  
                  //give the path
                  File dest=new File("C:\\Users\\DELL PC\\Desktop\\java tutorial\\amazon.png");
                  
       //move from src to dest
                  Files.copy(src, dest);
	}

}
