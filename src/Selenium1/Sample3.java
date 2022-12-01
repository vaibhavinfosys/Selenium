package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL PC\\Downloads\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/s?k=mazon+prime&i=dvd&adgrpid=1346903023296911&hvadid=84181717611614&hvbmt=be&hvdev=c&hvlocphy=1663&hvnetw=o&hvqmt=e&hvtargid=kwd-84182360690500%3Aloc-90&hydadcr=16818_13459331&tag=mh0b-20&ref=pd_sl_hhnv670ve_e");
	}

}
