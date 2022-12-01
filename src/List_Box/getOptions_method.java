package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/DELL%20PC/Desktop/Selenium%20HTML%20tab/ListBox.HTML");
        
               
           WebElement mock = driver.findElement(By.xpath("//select[@id='Whatsapp Mock7 group member']"));
            Select s=new Select(mock);
            
                          List<WebElement> options = s.getOptions();
                  
                            for(WebElement values:options) {
                            	System.out.println(values.getText()); 
                            }
            
                          
}                            
	
}
