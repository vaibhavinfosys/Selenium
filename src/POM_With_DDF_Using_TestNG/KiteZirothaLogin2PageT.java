package POM_With_DDF_Using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZirothaLogin2PageT {
	//Declaration
			@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
			
			@FindBy(xpath = "//button[@type='submit']")private WebElement clkContinueBtn;
			
			//initialization
			public KiteZirothaLogin2PageT(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			
			//implementation
		      public void enterPin(String pin) {
		    	  PIN.sendKeys(pin);
		      }
		      
		      public void clickOnContinueButton() {
		    	  clkContinueBtn.click();
		      }

}
