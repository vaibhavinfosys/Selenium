package page_factory_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLogin2Page {
	
	//Declaration
	@FindBy(xpath = "//button[text()='Not Now']")private WebElement Notenow;
	
	//initialization
		public InstagramLogin2Page(WebDriver driver) {
			PageFactory.initElements(driver,this);
}
		//implementation
	    public void clickOnNoteNow() {
	    	Notenow.click();
	    }
}
