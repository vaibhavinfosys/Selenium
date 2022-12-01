package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Customize_Listbox {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //click on create new account
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(2000);
        
        //locate the month
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Thread.sleep(2000);
        
        //create object of actions class
        Actions act=new Actions(driver);
        
        //click on month
        act.click(month).perform();
        Thread.sleep(2000);
        
        //Move one steep upward
        act.sendKeys(Keys.ARROW_UP).perform();
        
        
		
	}

}
