package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/xyz1/login.do");
		//inspect username
		driver.findElement(By.id("username")).sendKeys("hulwanvaibhav@gmail.com");
		//inspect password
		driver.findElement(By.name("pwd")).sendKeys("Vaibhav@12");
		//inspect login button
		driver.findElement(By.xpath("//div[text ()='Login ']")).click();
		driver.manage().window().maximize();
	}

}
