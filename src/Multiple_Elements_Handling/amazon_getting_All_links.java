package Multiple_Elements_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_getting_All_links {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    //use findElements method
	    List<WebElement> elements = driver.findElements(By.xpath("//a"));
	    for(  WebElement i:elements) {
	    	String str = i.getText();
	    	Thread.sleep(5000);
	    	System.out.println(str);
	    	
	    	driver.close();
	    	
	    }
	    
	   
	}
}
