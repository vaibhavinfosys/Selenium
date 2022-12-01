package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
      driver.navigate().to("https://www.flipkart.com/");
      driver.navigate().to("https://www.meesho.com/");
      //move backword
      Thread.sleep(4000);
      driver.navigate().back();
      //move forward
      driver.navigate().forward();
      
       
     
        

	}

}
