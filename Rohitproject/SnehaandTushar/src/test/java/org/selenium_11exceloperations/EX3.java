package org.selenium_11exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EX3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//to read the file we use FileInputStream

		FileInputStream fis = new FileInputStream ("./ExcelFile/TestData.xlsx");
		//Create instance of Worbook class using WorkBook Factory

		Workbook wb =WorkbookFactory.create(fis);

		//It return sheet of workbook and we need to store it in instance of Sheet further we will call the method of method Sheet class

		Sheet sheet1=wb.getSheet("TestDataSheet");

		//Same as above it retuns row number so here we need to pass row number 
		Row row1 =sheet1.getRow(0);

		//System.out.println(row1);no use 

		//It return total number of cell without following indexing
		int totalcell1=row1.getLastCellNum();
		System.out.println("totalcell1 "+totalcell1);

		//It return total no. of physically filled cell without following indexing
		int physicalNumberOfCells=row1.getPhysicalNumberOfCells();
		System.out.println("physicalNumberOfCells "+physicalNumberOfCells);
		//int totalRows = sheet1.getLastRowNum();
		//Row r=null;
		//for(int i=0;i<totalRows;i++) {
		for(int i=0;i<sheet1.getLastRowNum();i++) {

			//r=sheet1.getRow(i);
			//System.out.println(r.getLastCellNum());
			//Optimized way
			System.out.println(sheet1.getRow(i).getLastCellNum());
		}
	}
}



