package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector2 {
	public static void main(String[] args) throws Throwable {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://online.actitime.com/xyz1/login.do");
			//inspect username
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys("hulwanvaibhav@gmail.com");
			//inspect the password
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("Vaibhav@12");
			//inspect the submit button
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}

}
