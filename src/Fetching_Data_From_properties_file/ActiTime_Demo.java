package Fetching_Data_From_properties_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Demo {
	public static void main(String[] args) throws Throwable {
		
	
	FileInputStream fis=new FileInputStream("\\Users\\DELL PC\\eclipse-workspace\\Selenium\\ActiTimeDemo.properties");
	
	// create object of properties file
	 
	Properties prop=new Properties();
	
	prop.load(fis);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	String url = prop.getProperty("URL");
    driver.get(url);
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
         // fetching data for UserName
       String validUN = prop.getProperty("userName");
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(validUN);
    
    // fetching data for password
    
            String validPW = prop.getProperty("passWord");
          driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(validPW);
          
     // click on login button
          driver.findElement(By.xpath("//div[text()='Login ']")).click();
          
          // close the browser
          
      //    driver.close();
    
	
	   

}
}