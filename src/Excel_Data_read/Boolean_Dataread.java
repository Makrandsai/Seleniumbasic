package Excel_Data_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean_Dataread {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Om Sai\\eclipse-workspace\\26FEb_NewSelenium\\TestData\\TestData8.xlsx");

		
		 Sheet excelname = WorkbookFactory.create(file).getSheet("Sheet1");
		try
		{
		boolean value = excelname.getRow(0).getCell(0).getBooleanCellValue();
		}
		
		catch(Exception e )
		{
			System.out.println(e);
		}
		
      System.out.println();
       }
	 
       }
