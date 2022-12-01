package POM_with_PageFactory_withoutDDF4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	//declaration
	
	@FindBy(xpath = "//input[@id='userid']")private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LoginButton;
	 
	  //initialization
	
	public KiteLogin1Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	 
	  
	  //implementation
	
	public void enterUserID() {
		UN.sendKeys("DPG458");
	}
	
	public void enterPassword() {
		PWD.sendKeys("Amol@1234");
	}
	
	public void clickOnLoginButton() {
		LoginButton.click();
	}

	  


}
