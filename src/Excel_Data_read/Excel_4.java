package Excel_Data_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file = new 	FileInputStream("C:\\Users\\Om Sai\\eclipse-workspace\\26FEb_NewSelenium\\TestData\\TestData4.xlsx");
  
	Sheet Excelname = WorkbookFactory.create(file).getSheet("Sheet1");
	    
	String value = Excelname.getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
	
	String value1 = Excelname.getRow(1).getCell(0).getStringCellValue();
	System.out.println(value1);
	
	
	
	}

}
