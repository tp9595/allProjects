package org.selenium_11exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EX2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//to read the file we use FileInputStream

		FileInputStream fis = new FileInputStream ("./ExcelFile/TestData.xlsx");
		//Create instance of Worbook class using WorkBook Factory

		Workbook wb =WorkbookFactory.create(fis);

		//It return sheet of workbook and we need to store it in instance of Sheet further we will call the method of method Sheet class

		Sheet sheet1=wb.getSheet("TestDataSheet");
		System.out.println(sheet1);

		//This method follows Indexing here 
		int totalRows=sheet1.getLastRowNum();
		System.out.println("totalRows : "+totalRows);

		//It Returns only filled rows
		int totalPhysicalRow=sheet1.getPhysicalNumberOfRows();
		System.out.println("totalPhysicalRow : "+totalPhysicalRow);

		Sheet sheet2=wb.getSheetAt(4);
		//This method follows Indexing here 
		int totalDSRows=sheet2.getLastRowNum();
		System.out.println("totalDSRows : "+totalDSRows);

		//It Returns only filled rows
		int totalDSPhysicalRow=sheet2.getPhysicalNumberOfRows();
		System.out.println("totalDSPhysicalRow : "+totalDSPhysicalRow);


	}



}



