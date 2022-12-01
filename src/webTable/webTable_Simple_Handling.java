package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable_Simple_Handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/DELL%20PC/Desktop/Selenium%20HTML%20tab/WebTable%20by%20ANKUSH.html");
        
        //print the sachin from table.
        String text = driver.findElement(By.xpath("//table[@id='2244']//tr[2]//td[2]")).getText();
        System.out.println(text);
        
        //print the sagar from table.
        String text1 = driver.findElement(By.xpath("//table[@id='2244']//tr[4]//td[2]")).getText();
        System.out.println(text1);
        
        //print sangli from given table
        String text2 = driver.findElement(By.xpath("//table[@id='2244']//tr[4]//td[3]")).getText();
        System.out.println(text2);
        
        //print the entire row (suppose we want to print row number 4)
        String text3 = driver.findElement(By.xpath("//table[@id='2244']//tr[4]")).getText();
        System.out.println(text3);
        
      //print the entire row (suppose we want to print row number 2)
        String text4 = driver.findElement(By.xpath("//table[@id='2244']//tr[2]")).getText();
        System.out.println(text4);
        
        
	}

}
