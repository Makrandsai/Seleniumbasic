package Excel_Data_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException,FileNotFoundException {
	
		FileInputStream f = new FileInputStream("C:\\Users\\Om Sai\\eclipse-workspace\\26FEb_NewSelenium\\TestData\\TestData3.xlsx");

		Sheet Sheet3 = WorkbookFactory.create(f).getSheet("Sheet1");
		
		for(int row =0;row<=Sheet3.getLastRowNum();row++)
		{
			for(int col=0;col<Sheet3.getRow(row).getLastCellNum();col++)
			{
				
				String Value = Sheet3.getRow(row).getCell(col).getStringCellValue();
				System.out.print("  "+Value+" ");
			}
			System.out.println();
		}
		
	}

}
