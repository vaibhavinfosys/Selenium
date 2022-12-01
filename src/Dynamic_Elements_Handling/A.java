package Dynamic_Elements_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //search mobile under 20000 rupees
        
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile under 20000 ruppes",Keys.ENTER);
	
        //print the rating on the amazon webside
           String text = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-micro']//span)[2]")).getText();        
	              System.out.println(text);
	              
	              //print the price of mobile on the webpage
	              String text1 = driver.findElement(By.xpath("(//span[@class='a-price _bXVsd_price_23Ix_']//span)[1]")).getText();        
	              System.out.println(text1);
	              
	              
	}

}
