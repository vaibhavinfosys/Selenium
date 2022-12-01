package Handling_alert_OR_popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_Browser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.linkedin.com/");
    
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
    
    //Use get windowsHandle Method
         Set<String> ids = driver.getWindowHandles();
         
     //create object of ArrayList
         ArrayList<String> al=new ArrayList<String>(ids);
         
         //Get adress of child browser
             String cw = al.get(1);
             System.out.println(cw);
             
          //switch to child windows
             driver.switchTo().window(cw);
             
         //for confirmation we input data in the username field
             driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("hulwanvaibhav@gmail.com");
             
             //Get adress of main browser
             String mw = al.get(0);
             System.out.println(mw);
             
             //switch to main windows
             driver.switchTo().window(mw);
             driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("vaibhav");
             
             
         
         
         
	
}
}
