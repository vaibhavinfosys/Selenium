package WebDriver_Method_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gatePageSource_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486453138860&hvpos=&hvnetw=g&hvrand=10649640377090291604&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=CjwKCAjwrZOXBhACEiwA0EoRD8tvFPZO5V-e81-TXx7OQbqaJTu-qPa7gCXvgFj_D9sdLAuURH0_mBoCU6sQAvD_BwE");
	    String html = driver.getPageSource();
	    System.out.println(html);
	    
		
	}

}
