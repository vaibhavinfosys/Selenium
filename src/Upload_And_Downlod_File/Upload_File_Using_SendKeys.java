package Upload_And_Downlod_File;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_File_Using_SendKeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL PC\\\\Downloads\\\\Java\\\\chromedriver_win32(version-104.0)\\\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	      driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      
	      Actions act=new Actions(driver);
	      
	      WebElement chooseFile = driver.findElement(By.id("fileupload1"));
	      
	      act.moveToElement(chooseFile).perform();
	      
	      chooseFile.sendKeys("C:\\Users\\DELL PC\\Desktop\\Test case.txt");
	}

}
