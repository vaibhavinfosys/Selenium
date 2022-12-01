package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Take_Perticular_ScreenShot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement rinky = driver.findElement(By.xpath("//img[@alt='Google']"));
               File src = rinky.getScreenshotAs(OutputType.FILE);
               //to store in folder
              File dest=new File("C:\\Users\\DELL PC\\Desktop\\java tutorial\\vaibhav.jpg");
              Files.copy(src, dest);
		
	}

}
