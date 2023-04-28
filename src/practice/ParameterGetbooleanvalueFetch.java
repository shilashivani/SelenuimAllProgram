package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class ParameterGetbooleanvalueFetch {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	
		FileInputStream file=new FileInputStream("C:\\Users\\91702\\Documents\\ExeldataAutomation\\credentials.xlsx");
		double sheet=WorkbookFactory.create(file).getSheet("crendentials").getRow(0).getCell(0).getNumericCellValue();
		boolean sheet1=WorkbookFactory.create(file).getSheet("crendentials").getRow(0).getCell(0).getBooleanCellValue();
		String sheet2=WorkbookFactory.create(file).getSheet("crendentials").getRow(0).getCell(0).getStringCellValue();
		Hyperlink sheet3=WorkbookFactory.create(file).getSheet("crendentials").getRow(0).getCell(0).getHyperlink();
		LocalDateTime sheet4=WorkbookFactory.create(file).getSheet("crendentials").getRow(0).getCell(0).getLocalDateTimeCellValue();
}

}
