package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKey_Function {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\DELL PC\\\\Downloads\\\\Java\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8208111976");
          driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Vaibhav@12");
          driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Mobile under 20000rs");
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         Thread.sleep(3000);
          String s = driver.findElement(By.xpath("//div[text()='REDMI Note 10 Pro Max (Vintage Bronze, 128 GB)']")).getText();
           System.out.println(s);
	
	}

}
