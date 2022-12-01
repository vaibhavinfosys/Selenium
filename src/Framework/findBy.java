package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findBy {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //enter userId
        WebElement un = driver.findElement(By.xpath("//input[@id='userid']"));
        
        driver.navigate().refresh();
        un.sendKeys("DPG458");
	}

}
