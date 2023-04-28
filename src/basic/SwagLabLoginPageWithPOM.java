package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPageWithPOM {
	@FindBy (xpath="//input[@id='user-name']")private WebElement email;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//input[@id='login-button']")private WebElement login;
	public SwagLabLoginPageWithPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
   public void enterUserName(String emailId) {
	 email.sendKeys(emailId);
   }
   public void enterPassword(String pass) {
	   password.sendKeys(pass);
   }
   public void clickToLogin() {
	   login.click();
   }
}
