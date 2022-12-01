package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='_97w5']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vaibhav");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Hulwan");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("hulwanvaibhav@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vaibhav@123456");
         
        Thread.sleep(1000);
        // for day
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        
        //create object of select class
        Select d=new Select(day);
        
        //to give the value for day
        d.selectByValue("5");
        
        Thread.sleep(2000);
        
        // for month
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        
        //create object of select class
        Select m=new Select(month);
        
        //to give the value for day
        m.selectByValue("7");
        
        Thread.sleep(1000);
        // for year
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        
        //create object of select class
        Select y=new Select(year);
        
        //to give the value for day
        y.selectByValue("1995");
        
        Thread.sleep(1000);
        //it is for check box for check and unchecked
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(5000);
        
        boolean radioButton = driver.findElement(By.xpath("//label[text()='Male']")).isSelected();
        System.out.println(radioButton);
        
        if(radioButton==true) {
        	System.out.println("test case is pass");
        }
        else {
        	System.out.println("test case is fail");
        }
           
             /*    List<WebElement> option = y.getOptions();
                 for(WebElement values:option ) {
                	 System.out.println(values.getText());
                 } */
	}

}
