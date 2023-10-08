package org.selenium_11exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAlldataOfAllRows {

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
//		Row r;
//		Cell c;
//		for(int i=0;i<=sheet1.getLastRowNum();i++) {
//			r=sheet1.getRow(i);
//			for(int j=0;j<r.getLastCellNum();j++) {
//				c=r.getCell(j);
//				System.out.println(c.getStringCellValue());
//
//			}
//			System.out.println();
//		}
//OPtimize way
		for(int i=0;i<=sheet1.getLastRowNum();i++) {
			for(int j=0;j<sheet1.getRow(i).getLastCellNum();j++) {
				System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue());
		
			}
			System.out.println();
		}

	}
}




