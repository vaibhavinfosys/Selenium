package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
        //create object of Actions class
        Actions act=new Actions(driver);
        Thread.sleep(2000);
        act.dragAndDrop(src, dest).perform();
       
	}

}

