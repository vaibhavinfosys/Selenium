package WebDriver_Method_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle_Method {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.meesho.com/");
    //expected title
    String expTitle="Online Shopping Site for Fashion, Electronics, Home & More | Meesho";
                 String actTitle = driver.getTitle();
                 System.out.println(actTitle);
                 if(actTitle.equals(expTitle)) {
                	 System.out.println("Test case pass");
                 }
                 else {
                	 System.out.println("Test case fail");
                 }
}
}
