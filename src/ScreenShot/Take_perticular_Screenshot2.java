package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Take_perticular_Screenshot2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //take particular screenshot
        WebElement pinky = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        
        File src = pinky.getScreenshotAs(OutputType.FILE);
        
        //to store the screenshot in folder
        File dest=new File("C:\\Users\\DELL PC\\Desktop\\java tutorial\\vaibhav.jpg");
        
        //move from src to dest
        Files.copy(src, dest);
        
	}

}
