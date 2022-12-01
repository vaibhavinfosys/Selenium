package page_factory_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramClickOnProfilePage {
	//Declaration
			@FindBy(xpath = "(//div[@class='_aacl _aaco _aacu _aacx _aada'])[35]")private WebElement profileclick;
			
			//initialization
			public InstagramClickOnProfilePage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			
			//implementation
			public void profileClick() {
				profileclick.click();
			}

}
