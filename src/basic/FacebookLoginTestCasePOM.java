package basic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLoginTestCasePOM {
	WebDriver driver;
	@BeforeTest
	public void browser() {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
	}
	@Test
	public void ValidateLoginFacebookWithValiedUsernameAndPassword() throws EncryptedDocumentException, IOException
	{
		//WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		FaceBookLoginPageWithPOM faceBookLoginPageWithPOM=new FaceBookLoginPageWithPOM(driver);
		faceBookLoginPageWithPOM.enterEmailId(ParameterExcelFetch.getExelData(0, 0, "crendentials"));
		faceBookLoginPageWithPOM.enterPassword(ParameterExcelFetch.getExelData(0, 0, "crendentials"));
		faceBookLoginPageWithPOM.clickOnLogin();
		driver.quit();
//		faceBookLoginPageWithPOM.clickOnForgot();
//		faceBookLoginPageWithPOM.clickOnCreate();
//		faceBookLoginPageWithPOM.clickOnCreatePage();-
	}
	@Test
	public void ValidateLoginFacebookWithValiedUsernameAndInvaliedPassword() throws EncryptedDocumentException, IOException {
	//	WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		FaceBookLoginPageWithPOM faceBookLoginPageWithPOM=new FaceBookLoginPageWithPOM(driver);
		faceBookLoginPageWithPOM.enterEmailId(ParameterExcelFetch.getExelData(0, 0, "crendentials"));
		faceBookLoginPageWithPOM.enterPassword(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		faceBookLoginPageWithPOM.clickOnLogin();
		driver.close();
//		faceBookLoginPageWithPOM.clickOnForgot();
//		faceBookLoginPageWithPOM.clickOnCreate();
//		faceBookLoginPageWithPOM.clickOnCreatePage();
			}
	@Test
	public void ValidateLoginFacebookWithInvaliedUsernameAndInvaliedPassword() throws EncryptedDocumentException, IOException {
		//WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		FaceBookLoginPageWithPOM faceBookLoginPageWithPOM=new FaceBookLoginPageWithPOM(driver);
		faceBookLoginPageWithPOM.enterEmailId(ParameterExcelFetch.getExelData(0, 1, "crendentials"));
		faceBookLoginPageWithPOM.enterPassword(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		faceBookLoginPageWithPOM.clickOnLogin();
//		faceBookLoginPageWithPOM.clickOnCreate();
//		faceBookLoginPageWithPOM.clickOnForgot();
//		faceBookLoginPageWithPOM.clickOnCreatePage();

				
	}
	@Test
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FacebookLoginTestCasePOM obj=new FacebookLoginTestCasePOM();
		obj.ValidateLoginFacebookWithInvaliedUsernameAndInvaliedPassword();
		obj.ValidateLoginFacebookWithValiedUsernameAndPassword();
		obj.ValidateLoginFacebookWithValiedUsernameAndInvaliedPassword();
	}



}

