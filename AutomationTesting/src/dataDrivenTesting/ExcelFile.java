package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//path of the file
		FileInputStream fis=new FileInputStream(".\\TestData\\AutomationBatch.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		String value = workbook.getSheet("Batch").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);

	}

}
