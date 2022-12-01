package Handle_proxy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authentication_Proxy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/basic_auth.php");
		
		// for userName
		driver.switchTo().alert().sendKeys("guru99");
		driver.switchTo().alert().accept();
		// for password
		driver.switchTo().alert().sendKeys("guru99");
		driver.switchTo().alert().accept();
	}

}
