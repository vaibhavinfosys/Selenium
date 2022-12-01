package page_factory_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagranHomePage {
	//Declaration
	@FindBy(xpath = "//h2[text()='roshna1123']")private WebElement userId;
	
	//initialization
	public InstagranHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//implementation
	public void verifyUserId() {
		String expId="roshna1123";
		String actId=userId.getText();
		
		if(expId.equals(actId)) {
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test case is fail");
		}
	}



}
