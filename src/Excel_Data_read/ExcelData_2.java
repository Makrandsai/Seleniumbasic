package Excel_Data_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException,FileNotFoundException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Om Sai\\eclipse-workspace\\26FEb_NewSelenium\\TestData\\TestData2.xlsx");
        Sheet Excelsheet = WorkbookFactory.create(file).getSheet("Sheet1");
        
        for(int row=0;row<Excelsheet.getLastRowNum();row++)
        {
        	for(int col=0;col<Excelsheet.getRow(row).getLastCellNum();col++)
        	{
        		String value = Excelsheet.getRow(row).getCell(col).getStringCellValue();
        		System.out.print(value + "   ");
        	}
        	System.out.println();
        }
	}

}
