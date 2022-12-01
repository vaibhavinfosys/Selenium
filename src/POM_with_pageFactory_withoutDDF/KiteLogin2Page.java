package POM_with_pageFactory_withoutDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
	
	//Declaration
	@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
	
	@FindBy(xpath = "//button[text()='Continue ']")private WebElement continueButton;
	
	//initialization
	public KiteLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	//implementation or utilization
	public void enterPin() {
		PIN.sendKeys("171992");
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}	
}
	
	


