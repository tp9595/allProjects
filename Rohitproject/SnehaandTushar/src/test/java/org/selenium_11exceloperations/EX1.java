package org.selenium_11exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EX1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//to read the file we use FileInputStream
		
		FileInputStream fis = new FileInputStream ("./ExcelFile/TestData.xlsx");
		//Create instance of Worbook class using WorkBook Factory
		
		Workbook wb =WorkbookFactory.create(fis);
		
		int totalSheets=wb.getNumberOfSheets();
		System.out.println("totalSheets :"+totalSheets);
		
		//Need to pass index here it will return sheet name in string form
		String sheetName =wb.getSheetName(0);
		System.out.println(sheetName);
		
		//Need to pass sheet name here it will return sheet index here.
		
		int sheetIndex =wb.getSheetIndex("Assignment");
		System.out.println("sheetIndex :"+sheetIndex);
		
		System.out.println("**********************");
		for(int i =0;i<totalSheets;i++) {
			System.out.println(wb.getSheetName(i));
		
			
			
		
		}
		
		
		
		
	}

}

