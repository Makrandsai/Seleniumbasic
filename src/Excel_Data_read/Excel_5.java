package Excel_Data_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_5 {
   public static void main(String[] args) throws NullPointerException,EncryptedDocumentException, IOException,FileNotFoundException {
	
	   
	   FileInputStream f1 = new FileInputStream("C:\\Users\\Om Sai\\eclipse-workspace\\26FEb_NewSelenium\\TestData\\TestData5.xlsx");

     Sheet Filename = WorkbookFactory.create(f1).getSheet("Info");
     
     for(int row =0;row<=Filename.getLastRowNum();row++)
     {
    	 for(int col=0;col<Filename.getRow(row).getLastCellNum();col++)
    	 {
    		 String value = Filename.getRow(row).getCell(col).getStringCellValue();
    		 System.out.print(" "+value+" ");
    	 }
    	 System.out.println();
     }
//     
//  Sheet Filename1 = WorkbookFactory.create(f1).getSheet("Info1");
//     
//     for(int row =0;row<=Filename1.getLastRowNum();row++)
//     {
//    	 for(int col=0;col<Filename1.getRow(row).getLastCellNum();col++)
//    	 {
//    		 String value1 = Filename1.getRow(row).getCell(col).getStringCellValue();
//    		 System.out.print(" "+value1+" ");
//    	 }
//    	 System.out.println();
//     }
     
   }
   
}
