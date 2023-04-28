package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KhanAcademiLoginPageWithPOM {
	@FindBy(xpath="//div[text()='Continue with Google']")private WebElement  continueWithGoogle;
	@FindBy(xpath="//div[text()='Continue with Clever']")private WebElement  continuewithClever;
	@FindBy(xpath="//div[text()='Continue with Facebook']")private WebElement continueWithFacebook;
	@FindBy(xpath="//div[text()='Continue with Apple']")private WebElement continueWithApple;
	@FindBy(xpath="//input[@id='uid-login-form-0-wb-id-identifier-field']")private WebElement email;
	@FindBy(xpath="//input[@data-test-id='password-field']")private WebElement password;
	@FindBy(xpath="//a[text()='Forgot password?']")private WebElement forgot;
	@FindBy(xpath="//button[@data-test-id='log-in-submit-button']")private WebElement login;
	@FindBy(xpath="//a[text()='Create an account']")private WebElement create;

	public KhanAcademiLoginPageWithPOM(WebDriver driver) {
	PageFactory.initElements(driver, this );	
	

}
	public void clickToContinueWithGoogle()
	{
		continueWithGoogle.click();
	}
	public void clickToContinueWithClever() {
		continuewithClever.click();
	}
	public void clickToContinueWithApple() {
		continueWithApple.click();
	}
	public void enterEmailId(String emailId)
	{
		email.sendKeys(emailId);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnForgot() {
		forgot.click();
	}
	public void clickOnLogin() {
		login.click();
	}
	public void ClickOnCreateAPage() {
		create.click();
	}
}
