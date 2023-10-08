package org.selenium_11exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	writeDataInExcel("./ExcelFile/TestData.xlsx","DummySheet");

	}
	
	public static void writeDataInExcel(String filePath,String sheetName) throws EncryptedDocumentException, IOException {
	//To create new cell we use this code because without creating new cell we can not write in it.
	FileInputStream fis = new FileInputStream(filePath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet s1=wb.getSheet(sheetName);
	s1.getRow(1).createCell(7).setCellValue("Pass");
	s1.getRow(2).createCell(7).setCellValue("Fail");
	s1.getRow(3).createCell(7).setCellValue("Pass");
	s1.getRow(4).createCell(7).setCellValue("Fail");
	FileOutputStream fos =new FileOutputStream(filePath);
	wb.write(fos);
	
	
	}
}
