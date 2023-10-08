package org.selenium_11exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class GetAllCellTypes {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		GetAllCellTypes obj = new GetAllCellTypes();
		obj.getallCellType("./ExcelFile/TestData.xlsx","AllTestDataSheet");

	}
	public void getallCellType(String filePath,String sheetName) throws EncryptedDocumentException, IOException {

		FileInputStream fis =new FileInputStream(filePath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet s1 =wb.getSheet(sheetName);

		for(int i=0;i<=s1.getLastRowNum();i++){
			for(int j=0;j<s1.getRow(i).getLastCellNum();j++) {

				try {
					System.out.println(s1.getRow(i).getCell(j).getCellType());
				}catch(NullPointerException e) {
					System.out.println("Cell Is blank");

				}
			}
			System.out.println();
		}


	}

}
