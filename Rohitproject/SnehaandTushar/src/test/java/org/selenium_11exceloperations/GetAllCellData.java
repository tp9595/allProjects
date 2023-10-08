package org.selenium_11exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.selenium_01utilities.BaseUtilityUpdated;

public class GetAllCellData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		BaseUtilityUpdated bu =new BaseUtilityUpdated();
		bu.getDataOfParticularCell("./ExcelFile/TestData.xlsx","AllTestDataSheet", 2, 0);
		System.out.println("*************************");
		bu.getAllCellDataType("./ExcelFile/TestData.xlsx","AllTestDataSheet");

	}
	public static void getAllCellData(String filePath,String sheetName) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream (filePath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet(sheetName);
		for(int i=0;i<=s1.getLastRowNum();i++) {//7
			for(int j=0;j<s1.getRow(i).getLastCellNum();j++) {//6
				//Storing cell type in object of CellType	
				CellType ct=s1.getRow(i).getCell(j).getCellType();
				switch(ct) {
				case STRING:System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
				break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(s1.getRow(i).getCell(j))) {
						//System.out.println(s1.getRow(i).getCell(j).getDateCellValue());
						SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
						System.out.println(sdf.format(s1.getRow(i).getCell(j).getDateCellValue()));
					}else {
						System.out.println((long)s1.getRow(i).getCell(j).getNumericCellValue());
					}
					break;	
				case BOOLEAN:System.out.println(s1.getRow(i).getCell(j).getBooleanCellValue());
				break;
				case FORMULA:System.out.println(s1.getRow(i).getCell(j).getCellFormula());
				break;
				case BLANK:	System.out.println("Cell Is Blank");
				break;
				default :System.out.println("Invalid Cell Type");
				}
			}
			System.out.println();
		}
		
	}
}


