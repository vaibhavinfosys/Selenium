package POM_with_DDF_TESTNG2;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Actitime_Login_PageT {
	//Declarations
	
	@FindBy(xpath = "//input[@id='username']")private WebElement UN;
	@FindBy(xpath = "//input[@name='pwd']")private WebElement PWD;
    @FindBy(xpath = "//a[@id='loginButton']")private WebElement loginBtn;
    
    //initialization
    
    public Actitime_Login_PageT(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    
    //implementation
   
    
    public void enterUsername(String username) {
    	UN.sendKeys(username);
    }
    
    public void enterPassword(String password) {
    	PWD.sendKeys(password);
    }
    
    public void clickOnloginButton() {
    	loginBtn.click();
    }
}
