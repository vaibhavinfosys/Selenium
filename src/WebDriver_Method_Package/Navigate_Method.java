package WebDriver_Method_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	//open the application
	d.navigate().to("https://www.google.com/");
	//open the next application
	Thread.sleep(3000);
	d.navigate().to("https://www.flipkart.com/");
	//move backward
	Thread.sleep(3000);
	d.navigate().back();
	//move forward
	d.navigate().forward();
	//refresh the page
	d.navigate().refresh();
	//stop execution
	d.close();
	
	}

}
