package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class parameterizationPractice5 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver =OpenBrowser.OpenBrowser1("https://www.naaptol.com/");
		WebElement search=driver.findElement(By.xpath("//input[@id='header_search_text']"));
		
		FileInputStream file=new FileInputStream("C:\\Users\\91702\\Documents\\ExeldataAutomation\\credentials.xlsx");
		String value=WorkbookFactory.create(file).getSheet("credentials").getRow(4).getCell(0).getStringCellValue();
	}

}
