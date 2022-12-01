package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator4 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfb%20sign%20up%7C&placement=&creative=589460569891&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw3K2XBhAzEiwAmmgrAgOSt6zlKn1Y39nBnLC7E4yUijme7rEM-dK07Vxv97vQNe2doyZTZhoCUr4QAvD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("vaibhav");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("hulwan");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("8208111976");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Vaibhav@123456");
		Thread.sleep(2000);
		driver.findElement(By.id("day")).sendKeys("5");
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("july");
		Thread.sleep(2000);
		driver.findElement(By.id("year")).sendKeys("1995");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

}
