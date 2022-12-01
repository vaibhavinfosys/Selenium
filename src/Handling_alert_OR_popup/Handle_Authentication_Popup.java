package Handling_alert_OR_popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Authentication_Popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	    
	   
	}

}
