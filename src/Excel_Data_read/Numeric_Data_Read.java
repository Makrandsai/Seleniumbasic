package Excel_Data_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numeric_Data_Read {

	public static void main(String[] args) throws EncryptedDocumentException,FileNotFoundException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Om Sai\\eclipse-workspace\\26FEb_NewSelenium\\TestData\\TestData9.xlsx");

		
		 Sheet excelname = WorkbookFactory.create(file).getSheet("Sheet1");
		
		 // double value = excelname.getRow(0).getCell(0).getNumericCellValue();
		 // System.out.println(value);
	  for(int row = 0 ;row<=excelname.getLastRowNum();row++)
	   {
		for(int col = 0 ; col<excelname.getRow(row).getLastCellNum();col++)
		{
			double value = excelname.getRow(row).getCell(col).getNumericCellValue();
			System.out.print(" "+value +" ");
		}
		System.out.println();
	}
	}

}
