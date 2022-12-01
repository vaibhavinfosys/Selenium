package I_Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //switch to first frame
        driver.switchTo().frame("packageListFrame");  // driver.switchTo().frame(0);---this is first frame
        
        //for identification of frame we have to getText
        String textf1 = driver.findElement(By.xpath("//h2[text()='Packages']")).getText();
        System.out.println(textf1);
        
        //switch to main page
        driver.switchTo().defaultContent();
        
        //switch to second frame
        driver.switchTo().frame("packageFrame");   // driver.switchTo().frame(1);----this is second frame
        
        //for confirmation we have to getText() of that frame
        String textf2 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
        System.out.println(textf2);
        
        //switch to main page
        driver.switchTo().defaultContent();
        
        //switch to third frame
        driver.switchTo().frame("classFrame");   // driver.switchTo().frame(2);----this is Third frame
        
        //for confirmation we have to getText() of that frame
        String textf3 = driver.findElement(By.xpath("(//th[text()='Description'])[2]")).getText();
        System.out.println(textf3);
        
        //for closing the application
        driver.close();
        
        
	}

}
