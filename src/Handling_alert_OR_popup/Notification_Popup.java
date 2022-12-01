package Handling_alert_OR_popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
	   //use browser setting class is (chromeoptions)
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
	    c.addArguments("start-maximized");
	    
	    //open the browser
	    WebDriver driver=new ChromeDriver(c);
	    driver.manage().window().maximize();
	    driver.get("https://www.hdfc.com/");
	}

}
