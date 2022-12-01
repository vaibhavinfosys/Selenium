package Keys_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        //for username
        driver.findElement(By.id("username")).sendKeys("admin");
        //for password
        driver.findElement(By.name("pwd")).sendKeys("manager");
        //for click button
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

}
