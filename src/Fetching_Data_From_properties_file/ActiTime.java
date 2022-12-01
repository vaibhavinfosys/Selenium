package Fetching_Data_From_properties_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime {
	public static void main(String []args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("\\Users\\DELL PC\\eclipse-workspace\\Selenium\\ActiTime.properties");
		
		// create object of properties file
		 
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String richaMadam = prop.getProperty("browser");
		
		System.out.println(richaMadam);
		
		String richa = prop.getProperty("url");
		
		System.out.println(richa);
		
		
		// Let us take a scenario of browser opening....
		
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		     
		        WebDriver driver=new FirefoxDriver();
		        
		        driver.get("https:\\www.google.com");
		}
		
		else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
		}
	}
	

}
