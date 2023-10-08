package com.reqres.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtiltyByMe {
	static String filePath;
	static String sheetName;
	
	public ExcelUtiltyByMe (String filePath,String sheetName) {
	
	this.filePath=	filePath;
	this.sheetName=sheetName;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ExcelUtiltyByMe euti=new ExcelUtiltyByMe("./forPayLoad.xlsx","Data");
		System.out.println(euti.getDataFromExcel("name",1));
	}
	
	public  String getDataFromExcel(String requiredKey,int requiredRow) throws EncryptedDocumentException, IOException {
		//BaseUtilityUpdated bu = new BaseUtilityUpdated();
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet(sheetName);
		HashMap<String,String> data=new HashMap<String,String>();
		for(int i=0;i<s1.getRow(0).getLastCellNum();i++) {

			String key =s1.getRow(0).getCell(i).getStringCellValue();
			String value = /* bu. */
			getObjectOfParticularCell(filePath, sheetName,requiredRow,i);
			data.put(key, value);
		}
		//System.out.println(data);
		//System.out.println(data.get(requiredKey));
		return data.get(requiredKey);
	}
	
	public static String getObjectOfParticularCell(String filePath,String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream (filePath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet(sheetName);
		String data;
		for(int i=0;i<=s1.getLastRowNum();i++) {//7
			for(int j=0;j<s1.getRow(i).getLastCellNum();j++) {//6
				//Storing cell type in object of CellType	
				if(i==row && j==cell) {
					try {
						Cell cellValue=s1.getRow(i).getCell(j);
						
						
							DataFormatter formatter = new DataFormatter();
							String cellData = formatter.formatCellValue(cellValue);// Return the formatted value of a cell as a string
																				// regardless of the cell type
							return cellData;

						} catch (Exception e) {
							data = "";
						}}
//						CellType ct=s1.getRow(i).getCell(j).getCellType();
//						switch(ct) {
//						case STRING://System.out.println(s1.getRow(i).getCell(j).getStringCellValue());
//							return (s1.getRow(i).getCell(j).getStringCellValue());
//
//						case NUMERIC:
//							if(DateUtil.isCellDateFormatted(s1.getRow(i).getCell(j))) {
//								//System.out.println(s1.getRow(i).getCell(j).getDateCellValue());
//								SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
//								//System.out.println(sdf.format(s1.getRow(i).getCell(j).getDateCellValue()));
//								return (sdf.format(s1.getRow(i).getCell(j).getDateCellValue()));
//							}else {
//								//System.out.println((long)s1.getRow(i).getCell(j).getNumericCellValue());
//								return ((String)s1.getRow(i).getCell(j).getNumericCellValue());
//							}
//
//						case BOOLEAN://System.out.println(s1.getRow(i).getCell(j).getBooleanCellValue());
//							return (s1.getRow(i).getCell(j).getBooleanCellValue());
//
//						case FORMULA://System.out.println(s1.getRow(i).getCell(j).getCellFormula());
//							return (s1.getRow(i).getCell(j).getCellFormula());
//						default ://System.out.println("Invalid Cell Type");
//							return "Invalid Cell Type";
//						}
//					}catch(NullPointerException e) {
//						System.out.println("");
//					}
				

			}

		}
		return null;
	}
	

}
