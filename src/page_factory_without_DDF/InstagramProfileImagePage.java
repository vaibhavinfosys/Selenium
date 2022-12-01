package page_factory_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramProfileImagePage {
	
	
	//Declaration
		@FindBy(xpath = "(//img[@class='_aa8j'])[31]")private WebElement profileimg;
		
		//initialization
		public InstagramProfileImagePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//implementation
		public void imgClick() {
			profileimg.click();
		}
			

}
