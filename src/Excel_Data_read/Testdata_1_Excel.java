package Excel_Data_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Testdata_1_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Om Sai\\eclipse-workspace\\26FEb_NewSelenium\\TestData\\TestData1.xlsx");
        
		Sheet Exceldata = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String EmployeeName = Exceldata.getRow(0).getCell(0).getStringCellValue();
		
		String EmployeeName1 = Exceldata.getRow(0).getCell(1).getStringCellValue();
		System.out.println(EmployeeName);
		System.out.println(EmployeeName1);
	}

}
