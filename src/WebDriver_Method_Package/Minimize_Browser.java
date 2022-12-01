package WebDriver_Method_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_Browser {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//open the application
		d.get("https://www.flipkart.com/");
		//first we maximize the browser for understanding
		Thread.sleep(5000);
		d.manage().window().maximize();
		//minimize the browser
		Thread.sleep(5000);
		d.manage().window().minimize();
	}

}
