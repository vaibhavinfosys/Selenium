package page_factory_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLogin3page {
	//Declaration
		@FindBy(xpath = "//button[@class='_a9-- _a9_1']")private WebElement Notenow1;
		
		//initialization
			public InstagramLogin3page(WebDriver driver) {
				PageFactory.initElements(driver,this);
	}
			//implementation
		    public void clickOnNoteNow() {
		    	Notenow1.click();
		    }

}
