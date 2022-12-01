package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class With_DDF {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL PC\\Desktop\\java tutorial\\mahaguru.xlsx");
		
		//open excel sheet
		Sheet richa = WorkbookFactory.create(fis).getSheet("sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32(version-104.0)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://kite.zerodha.com/");
		
		//input UN
	String roshanali = richa.getRow(1).getCell(0).getStringCellValue();
		
		 driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(roshanali);
		
		 //input password
		 String shrikant = richa.getRow(1).getCell(1).getStringCellValue();
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(shrikant);
		  
		   //click on login button
	        driver.findElement(By.xpath("//button[text()='Login ']")).click();
	        Thread.sleep(8000);
	        
	        //input PIN
	        String vaibhav = richa.getRow(1).getCell(2).getStringCellValue();
	        driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(vaibhav);
	        
	        //click on continue button
	        driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	        
	        
	        String expID="DPG458";
	        String actID = richa.getRow(1).getCell(0).getStringCellValue();	        
	        
	        if(expID.equals(actID)) {
	        	System.out.println("Test case pass");
	        }
	        else {
	        	System.out.println("Test case Fail");
	        }
	}

}
