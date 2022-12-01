package Handling_alert_OR_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        //to enter the customer ID
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
        
        //to click on submit button
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        
        //handle the alert popups-
        //to click on ok button
       // driver.switchTo().alert().accept();
        
        //To click on cancel button
      //  driver.switchTo().alert().dismiss();
        
        //To get the text on the Alert
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
	}

} 

