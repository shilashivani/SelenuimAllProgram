package basic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public class khanAcademiTestCaseWithPom {
	public void ValidateLoginKhanAcademyWithValiedUsernameAndPassword() throws EncryptedDocumentException, IOException
	{
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.khanacademy.org/login");
		KhanAcademiLoginPageWithPOM khanAcademiLoginPageWithPOM=new KhanAcademiLoginPageWithPOM(driver);
		khanAcademiLoginPageWithPOM.enterEmailId(ParameterExcelFetch.getExelData(0, 0, "crendentials"));
		khanAcademiLoginPageWithPOM.enterPassword(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		khanAcademiLoginPageWithPOM.clickOnLogin();

}
	public void ValidateLoginKhanAcademyWithInvaliedUserNameAndValiedPassword() throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.khanacademy.org/login");
		KhanAcademiLoginPageWithPOM khanAcademiLoginPageWithPOM=new KhanAcademiLoginPageWithPOM(driver);
		khanAcademiLoginPageWithPOM.enterEmailId(ParameterExcelFetch.getExelData(0, 1, "crendentials"));
		khanAcademiLoginPageWithPOM.enterPassword(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		khanAcademiLoginPageWithPOM.clickOnLogin();
		
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		khanAcademiTestCaseWithPom obj=new khanAcademiTestCaseWithPom() ;
	//	obj.ValidateLoginKhanAcademyWithValiedUsernameAndPassword();
		obj.ValidateLoginKhanAcademyWithInvaliedUserNameAndValiedPassword();	
		
	}
}
