package Actions_Class;

import java.awt.Desktop.Action;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Actions_Class1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
        WebElement element = driver.findElement(By.xpath("//a[text()='Gmail']"));
        
        //create object of actions class
        Actions act=new Actions(driver);
        
        act.moveToElement(element).click().perform();
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,-1000)");
        
            
             WebElement ts = driver.findElement(By.xpath("//img[@title='Gmail inbox screen with enlarged function icons']"));
             File src = ts.getScreenshotAs(OutputType.FILE);
             //create object of file class
             File dest=new File("C:\\Users\\DELL PC\\Desktop\\java tutorial\\vaibhav.jpg");
             
             Files.copy(src, dest);
       
        
        
	}

}
