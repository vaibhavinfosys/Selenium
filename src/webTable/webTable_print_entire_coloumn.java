package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable_print_entire_coloumn {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/DELL%20PC/Desktop/Selenium%20HTML%20tab/WebTable%20by%20ANKUSH.html");
         //print the column using for loop
        for(int i=1;i<=5;i++) {
        	Thread.sleep(2000);
        	if(i==1) {
        		Thread.sleep(2000);
        		String text = driver.findElement(By.xpath("//table[@id='2244']//tr["+i+"]/th[2]")).getText();
        		System.out.println(text);
        	}
        	else {
        		Thread.sleep(2000);
        		String text2 = driver.findElement(By.xpath("//table[@id='2244']//tr["+i+"]/td[2]")).getText();
        		System.out.println(text2);
        	}
        }
     
	}

}
