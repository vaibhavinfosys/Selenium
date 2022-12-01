package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//inspect username or mobile number
		driver.findElement(By.id("email")).sendKeys("8796367612");
		//inspect password
		driver.manage().window().maximize();
		driver.findElement(By.name("pass")).sendKeys("Vaibhav@12");
		
		//inspect submitt button
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
	}

}
