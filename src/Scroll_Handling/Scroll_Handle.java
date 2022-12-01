package Scroll_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Handle {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        //for scrolling down
        JavascriptExecutor jse=( JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,2000);");
        Thread.sleep(3000);
        //for scrolling up
        jse.executeScript("window.scrollBy(0,-1000);");
        
        
	}

}
