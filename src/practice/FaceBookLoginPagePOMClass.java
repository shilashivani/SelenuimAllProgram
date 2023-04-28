package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPagePOMClass {
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='pass']")private WebElement password;
	@FindBy(xpath="//button[@name='login']")private WebElement login;
	public FaceBookLoginPagePOMClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void  entervaliedEmailId(String emailId)
	{
		email.sendKeys(emailId);
	}
	public void enterValiedPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickToLoginButton() {
		login.click();
	}

}