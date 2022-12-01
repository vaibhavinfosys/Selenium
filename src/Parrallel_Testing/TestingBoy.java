package Parrallel_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestingBoy {
	@Test
	public void TC1() {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\DELL PC\\\\Downloads\\\\Java\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.imdb.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//input[@id='suggestion-search']")).sendKeys("Pushpa:The Rise");
        driver.findElement(By.xpath("//button[@id='suggestion-search-button']")).click();
        driver.findElement(By.xpath("//a[text()='Pushpa: The Rise - Part 1']")).click();
        driver.findElement(By.xpath("//a[text()='Release date']")).click();
        WebElement country = driver.findElement(By.xpath("(//div[@class='article listo']//a)[11]"));
             String co = country.getText();
             System.out.println(co);
        WebElement releaseDate = driver.findElement(By.xpath("(//div[@class='article listo']//td)[17]"));
              
                  String date = releaseDate.getText();
                  System.out.println(date);
                  
                  driver.get("https://en.wikipedia.org/wiki/Wiki");
                  driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Pushpa:The Rise");     
                  driver.findElement(By.xpath("//input[@id='searchButton']")).click(); 
                  driver.findElement(By.xpath("//a[@title='Pushpa: The Rise']")).click();
                  
                  WebElement country2 = driver.findElement(By.xpath("(//table[@class='infobox vevent']//td)[13]"));
                  String countr = country2.getText();
                  System.out.println(countr);
             WebElement releaseDate2 = driver.findElement(By.xpath("(//table[@class='infobox vevent']//li)[10]"));
                   
                       String date2 = releaseDate2.getText();
                       System.out.println(date2);
                       
                       //verify the release date of imdb amd wiki
                       
                       String dateInimdb = releaseDate.getText();
                       String dateinWiki = releaseDate2.getText();
                       
                       if(dateInimdb.equalsIgnoreCase(dateinWiki)) {
                    	   System.out.println("test case is pass");
                       }
                       else {
                    	   System.out.println("test case is fail");
                       }
                       
                     //verify the release date of imdb amd wiki
                       
                       String countryinimdb = country.getText();
                       String countryinwiki = country2.getText();
                       
                       if(countryinimdb.equalsIgnoreCase(countryinwiki)) {
                    	   System.out.println("test case is pass");
                       }
                       else {
                    	  System.out.println("test case is fail");
                       }
                       
                       // close the browser
                       driver.close();
                       
       
	}

}
