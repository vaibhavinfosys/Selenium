package Validate_Colour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class colour_Validation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	    
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    
	   WebElement t = driver.findElement(By.tagName("input"));
	  //obtain color in rgba
	   String s = t.getCssValue("color");
	   
	   System.out.println("colour is"+s);
	   
	// convert rgba to hex
	   
	   String c = Color.fromString(s).asHex();
	   System.out.println("Hex code for color:" + c);
	  
	    

}
}
