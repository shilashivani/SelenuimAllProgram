package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPageWithPOM {
	@FindBy (xpath = "//input[@id='email']")private WebElement email;
	@FindBy (xpath = "//input[@id='pass']")private WebElement password;
	@FindBy(xpath="//button[@name='login']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement forgot;
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']")private WebElement create;
	@FindBy(xpath="//a[text()='Create a Page']")private WebElement createPage;
    public FaceBookLoginPageWithPOM(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void enterEmailId(String emailId) {
    	email.sendKeys(emailId);
    }
    public void enterPassword(String pass)
    {
    	password.sendKeys(pass);
    }
    public void clickOnLogin() {
    	login.click();
    }
    public void clickOnForgot() {
    	forgot.click();
    }
    public void clickOnCreate() {
    	create.click();
    }
    public void clickOnCreatePage() {
    	createPage.click();
    }
}
