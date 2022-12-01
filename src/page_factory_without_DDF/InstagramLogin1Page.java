package page_factory_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLogin1Page {
	//declaration
	@FindBy(xpath = "//input[@name='username']")private WebElement UN;
	@FindBy(xpath = "//input[@name='password']")private WebElement PWD;
	@FindBy(xpath = "//div[text()='Log In']")private WebElement Loginbtn;
	
	
	//initialization
	public InstagramLogin1Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//implementation
    public void enterUN() {
    	UN.sendKeys("roshna1123");
    }
    public void enterPwd() {
    	PWD.sendKeys("Roshna@123");
    }
    public void clickOnLoginButton() {
    	Loginbtn.click();
    }
    
}
