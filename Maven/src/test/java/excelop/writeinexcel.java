package excelop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeinexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		writeinexcel obj = new writeinexcel();
		obj.writeDataInExcel();
	}

	public void writeDataInExcel() throws EncryptedDocumentException, IOException {
		// To create new cell we use this code because without creating new cell we can
		// not write in it.
		FileInputStream fis = new FileInputStream("C:\\Users\\akshay\\Desktop\\eclipse practice.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("program2");
//		for (int i = 1; i < s1.getLastRowNum(); i++) {
//			Row row = s1.getRow(i);
//			int cellcount = row.getLastCellNum();
//			row.createCell(cellcount).setCellValue("pass");
//			// System.out.print(row.getCell(i).getStringCellValue() + "\t");
//
//		}
		Row row = s1.getRow(1);
		int cellcount = row.getLastCellNum();
		row.createCell(cellcount).setCellValue("pass");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\akshay\\Desktop\\eclipse practice.xlsx");
		wb.write(fos);
		fos.flush();
		fos.close();

	}
}
