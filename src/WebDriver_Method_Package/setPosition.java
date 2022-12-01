package WebDriver_Method_Package;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
                  WebDriver driver=new ChromeDriver();
                  driver.get("https://www.meesho.com/");
                  //setPosition method
                  Point p=new Point(100,300);
                  driver.manage().window().setPosition(p);
                  
	
	}

}
