package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
        
        //create object of Action class
        Actions act=new Actions(driver);
        
        //move cursor on target that is Gmail.
        act.moveToElement(target).perform();
        
        //We have to right click on target.
        act.contextClick().perform();
        
        //We have to double click on gmail
        act.doubleClick().perform();//buatyfull it will open the gmail.
        
        
	}

}
