package PRACTICE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/DELL%20PC/Desktop/Selenium%20HTML%20tab/FacebookSignup.HTML");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        String attribute = driver.findElement(By.id("u_0_b_Q4")).getAttribute("Text");
        
        System.out.println(attribute);
	}

}
