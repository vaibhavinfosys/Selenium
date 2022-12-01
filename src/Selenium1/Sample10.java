package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	    WebDriver s=new FirefoxDriver();
	    s.get("https://www.google.com/");
	
	
	}

}
