package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class DataExelFetchPractice {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	
		FileInputStream file=new FileInputStream("C:\\Users\\91702\\Documents\\ExeldataAutomation\\credentials.xlsx");
		String sheet=WorkbookFactory.create(file).getSheet("crendentials").getRow(0).getCell(0).getStringCellValue();
	}}