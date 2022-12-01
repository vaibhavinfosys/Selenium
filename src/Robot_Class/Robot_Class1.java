package Robot_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
       driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        //create object of robot class
        Robot r=new  Robot();
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        Thread.sleep(1000);
        
        
	}

}
