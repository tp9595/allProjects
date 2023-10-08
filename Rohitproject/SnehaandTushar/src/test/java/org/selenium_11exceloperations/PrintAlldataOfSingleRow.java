package org.selenium_11exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAlldataOfSingleRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//to read the file we use FileInputStream

		FileInputStream fis = new FileInputStream ("./ExcelFile/TestData.xlsx");
		//Create instance of Worbook class using WorkBook Factory

		Workbook wb =WorkbookFactory.create(fis);

		//It return sheet of workbook and we need to store it in instance of Sheet further we will call the method of method Sheet class

		Sheet sheet1=wb.getSheet("TestDataSheet");

		//Same as above it retuns row number so here we need to pass row number 
		Row row0 =sheet1.getRow(1);
		
		//Same as above it returns Cell number so here we need to pass cell number
		Cell cell1 =row0.getCell(0);
		Cell cell2 =row0.getCell(1);
		Cell cell3 =row0.getCell(2);
		
		System.out.println(cell1.getStringCellValue());
		System.out.println(cell2.getStringCellValue());
		System.out.println(cell3.getStringCellValue());
		System.out.println("***************************");
		for(int i =0;i<row0.getLastCellNum();i++) {
			System.out.print(row0.getCell(i).getStringCellValue()+" ");
		}
	}
}



