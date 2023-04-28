package practice;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelDataAccess {
	public static double exelSheetdata(int row,int cell,String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\91702\\Documents\\ExeldataAutomation\\credentials.xlsx");
     double value=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
		return value;
	}

}
