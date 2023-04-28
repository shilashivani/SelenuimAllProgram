package POMPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KhanAcademyLoginPOM {
@FindBy (xpath="//input[@id='uid-login-form-0-wb-id-identifier-field']")private WebElement email;
  @FindBy(xpath="//input[@data-test-id='password-field']")private WebElement password;
  @FindBy (xpath="//a[text()='Forgot password?']")private WebElement login;
  public KhanAcademyLoginPOM(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  public void  enterEmailIdToKhanAcademy(String emailid)
  {
	  email.sendKeys(emailid);
  }
  public void EnterPasswordToKhanAcademy(String pass)
  {
	  password.sendKeys(pass);
  }
  public void clickToLoginButton() {
	  login.click();
  }
 
}
