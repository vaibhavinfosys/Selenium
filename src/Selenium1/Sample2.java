package Selenium1;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL PC\\\\Downloads\\\\Java\\\\chromedriver_win32(version-104.0)\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String anky = driver.getPageSource();
	System.out.println(anky);
	
}
}
