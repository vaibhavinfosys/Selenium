package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class List_box1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/DELL%20PC/Desktop/Selenium%20HTML%20tab/ListBox.HTML");
           WebElement mock = driver.findElement(By.xpath("//select[@id='Whatsapp Mock7 group member']"));
            Select s=new Select(mock);
            
          //  select by visible text
            s.selectByVisibleText("Shrikant");
          
            //select by value
          //  s.selectByValue("d");
            
            //select by group index
          //  s.selectByIndex(4);
            
        driver.close();
        
        
            
	}

}
