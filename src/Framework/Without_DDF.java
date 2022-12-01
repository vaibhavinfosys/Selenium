package Framework;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Without_DDF {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        ChromeOptions c=new ChromeOptions();
       c.addArguments("--disable-notifications");
       c.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(c);
        driver.get("https://kite.zerodha.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //input username
        driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DPG458");
        
        //input password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Amol@1234");
        
        //click on login button
        driver.findElement(By.xpath("//button[text()='Login ']")).click();
        
        
        //input PIN
        driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("171992");
        
        //click on continue button
        driver.findElement(By.xpath("//button[text()='Continue ']")).click();
        
       
	}

}
