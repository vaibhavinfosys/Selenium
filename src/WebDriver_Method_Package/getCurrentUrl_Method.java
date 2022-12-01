package WebDriver_Method_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.meesho.com/");
        String expurl="https://www.meesho.com/";
         //Actual URL
                 String acturl = driver.getCurrentUrl();
                 System.out.println(acturl);
                 if(acturl.equals(expurl)) {
                	 System.out.println("test case is pass");
                 }
                 else {
                	 System.out.println("Test case is fail");
                 }
	}

}
