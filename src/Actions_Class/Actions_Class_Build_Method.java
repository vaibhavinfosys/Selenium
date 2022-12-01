package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class_Build_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
        //create object of Actions class
        Actions act=new Actions(driver);
        
        //Use of build() method for join multiple method in single statement.
        act.moveToElement(target).contextClick().doubleClick().build().perform();//we can perform multiple action in single statement by using build method. 
        
       
	}

}
