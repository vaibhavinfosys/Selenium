package Default;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL PC\\\\Downloads\\\\Java\\\\chromedriver_win32(version-104.0)\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
   driver.get("https://en.wikipedia.org/wiki/Pushpa%3A_The_Rise");
   
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
  WebElement name = driver.findElement(By.xpath("(//table[@class='infobox vevent']//li)[10]"));
  
                                   String rd = name.getText();
                                   
                                   System.out.println(rd);
                                   
                                   driver.close();
   
  /* driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("cchcnuc62");
   
   driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']")).click();
   
     String Acttext = driver.findElement(By.xpath("//div[text()='Welcome, vaibhav!']")).getText();
     
        String expectedtext="Welcome, vaibhav!";
        if(Acttext==expectedtext) {
        	System.out.println("test case is pass");
        }
        else {
        	System.out.println("test case is fail");
        } */
   
           
    
    
    
  
}
}
