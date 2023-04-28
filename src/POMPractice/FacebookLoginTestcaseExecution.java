package POMPractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basic.FaceBookLoginPageWithPOM;
import basic.FacebookLoginTestCasePOM;
import basic.OpenBrowser;
import basic.ParameterExcelFetch;

public class FacebookLoginTestcaseExecution {
	//WebDriver driver;
	@BeforeTest
	@Test
	public void userEnterValidateEmailIdAndPassword() throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		FacebookLoginPom facebookLoginPom=new FacebookLoginPom(driver);
		facebookLoginPom.enterCorrectEmailId(ParameterExcelFetch.getExelData(0, 0, "crendentials"));
		facebookLoginPom.enterCorrectPassword(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		//facebookLoginPom.clickLoginButton();
		facebookLoginPom.clickCreateButton();
		facebookLoginPom.enterFirstNamehdp(ParameterExcelFetch.getExelData(2, 0, "crendentials"), driver);
		facebookLoginPom.enterLastName(ParameterExcelFetch.getExelData(2, 1, "crendentials"));
	
	}
	@Test
	public void ValidateLoginFacebookWithValiedUsernameAndInvaliedPassword() throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		FaceBookLoginPageWithPOM faceBookLoginPageWithPOM=new FaceBookLoginPageWithPOM(driver);
		faceBookLoginPageWithPOM.enterEmailId(ParameterExcelFetch.getExelData(0, 0, "crendentials"));
		faceBookLoginPageWithPOM.enterPassword(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		//faceBookLoginPageWithPOM.clickOnLogin();
	
		//driver.close();
//		faceBookLoginPageWithPOM.clickOnForgot();
		//faceBookLoginPageWithPOM.clickOnCreate();
//		faceBookLoginPageWithPOM.clickOnCreatePage();
			}
	@Test
	public void ValidateLoginFacebookWithInvaliedUsernameAndInvaliedPassword() throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		FaceBookLoginPageWithPOM faceBookLoginPageWithPOM=new FaceBookLoginPageWithPOM(driver);
		faceBookLoginPageWithPOM.enterEmailId(ParameterExcelFetch.getExelData(0, 1, "crendentials"));
		faceBookLoginPageWithPOM.enterPassword(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		faceBookLoginPageWithPOM.clickOnLogin();
//		faceBookLoginPageWithPOM.clickOnCreate();
//		faceBookLoginPageWithPOM.clickOnForgot();
//		faceBookLoginPageWithPOM.clickOnCreatePage();

				
	}
	
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FacebookLoginTestcaseExecution obj=new FacebookLoginTestcaseExecution();
	obj.userEnterValidateEmailIdAndPassword();
}
}
