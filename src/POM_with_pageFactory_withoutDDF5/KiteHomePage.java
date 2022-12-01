package POM_with_pageFactory_withoutDDF5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//Declaration
			@FindBy(xpath = "//span[@class='user-id']")private WebElement UserID;
			
			//initialization
			public KiteHomePage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			
			//implementation/utilization
			public void verifyUserId() {
				String expId="DPG458";
			String actId=UserID.getText();
			
			if(expId.equals(actId)) {
				System.out.println("Test case is pass");
			}
			else {
				System.out.println("Test case is Fail");
			}
			}


}
