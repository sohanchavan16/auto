package newautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fatchdatafromexcelsheet {

	public static String getdata (int row, int cell) throws EncryptedDocumentException, IOException {
		 
		  FileInputStream file= new FileInputStream("E:\\Book6.xlsx");
				  
  String name= WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
                      System.out.println(name);
                      return name;
	}

}     
