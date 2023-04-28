package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import basic.OpenBrowser;
import basic.ParameterExcelFetch;

public class FaceBookLoginTestCasePom1 {
	public void varifyEnteredValiedEmailAndPassword() throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		FaceBookLoginPagePOMClass faceBookLoginPagePOMClass=new FaceBookLoginPagePOMClass(driver);
		faceBookLoginPagePOMClass.entervaliedEmailId(ParameterExcelFetch.getExelData(0, 0, "crendentials"));
		faceBookLoginPagePOMClass.enterValiedPassword(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		faceBookLoginPagePOMClass.clickToLoginButton();
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FaceBookLoginTestCasePom1 obj=new FaceBookLoginTestCasePom1(); 
			obj.varifyEnteredValiedEmailAndPassword();
		
	}

}
