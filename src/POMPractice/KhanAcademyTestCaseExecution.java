package POMPractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basic.OpenBrowser;
import basic.ParameterExcelFetch;

public class KhanAcademyTestCaseExecution {
	//WebDriver driver;
	@BeforeTest
	@Test
	public void validateKhanAcademyLoginCorrectUserNameAndPassword() throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.khanacademy.org/login");
		KhanAcademyLoginPOM khanAcademyLoginPOM=new KhanAcademyLoginPOM( driver); 
		khanAcademyLoginPOM.enterEmailIdToKhanAcademy(ParameterExcelFetch.getExelData(0, 0, "crendentials"));
		khanAcademyLoginPOM.EnterPasswordToKhanAcademy(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		khanAcademyLoginPOM.clickToLoginButton();
	}
	@Test
	public void validateKhanAcademyLoginInCorrectUserNameAndPassword() throws EncryptedDocumentException, IOException {
		WebDriver driver=Browser.OpenBrowser("https://www.khanacademy.org/login");
		KhanAcademyLoginPOM khanAcademyLoginPOM=new KhanAcademyLoginPOM( driver); 
		khanAcademyLoginPOM.enterEmailIdToKhanAcademy(ParameterExcelFetch.getExelData(0, 3, "crendentials"));
		khanAcademyLoginPOM.EnterPasswordToKhanAcademy(ParameterExcelFetch.getExelData(1, 3, "crendentials"));
		khanAcademyLoginPOM.clickToLoginButton();	
	}
	@Test
	public void validateKhanAcademyLoginInCorrectUserNameAndValiedPassword() throws EncryptedDocumentException, IOException {
	WebDriver driver=Browser.OpenBrowser("https://www.khanacademy.org/login");
	KhanAcademyLoginPOM khanAcademyLoginPOM=new KhanAcademyLoginPOM( driver); 
	khanAcademyLoginPOM.enterEmailIdToKhanAcademy(ParameterExcelFetch.getExelData(0, 1, "crendentials"));
	khanAcademyLoginPOM.EnterPasswordToKhanAcademy(ParameterExcelFetch.getExelData(1, 1, "crendentials"));
	khanAcademyLoginPOM.clickToLoginButton();
	}
	@Test
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		KhanAcademyTestCaseExecution obj=new KhanAcademyTestCaseExecution();
		obj.validateKhanAcademyLoginCorrectUserNameAndPassword();
		//obj.validateKhanAcademyLoginInCorrectUserNameAndPassword();
		//obj.validateKhanAcademyLoginInCorrectUserNameAndValiedPassword();
	}

}
