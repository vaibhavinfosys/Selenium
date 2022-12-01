package Dynamic_Elements_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.worldometers.info/coronavirus/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //print the corona virus cases
        String text = driver.findElement(By.xpath("(//div[@class='maincounter-number']//span)[1]")).getText();
        System.out.println(text);
        
        //print the corona virus death
         String text2 = driver.findElement(By.xpath("((//div[@class='maincounter-number'])[2]//span)[1]")).getText();
         System.out.println(text2);
         
         //print the corona virus recovered
         String text3 = driver.findElement(By.xpath("((//div[@class='maincounter-number'])[3]//span)[1]")).getText();
         System.out.println(text3);
        
       
	}

}
