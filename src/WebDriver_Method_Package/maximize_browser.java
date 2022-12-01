package WebDriver_Method_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize_browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//open the application
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();//method chaining concept
	}

}
