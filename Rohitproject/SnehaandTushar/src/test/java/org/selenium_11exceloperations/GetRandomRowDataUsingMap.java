package org.selenium_11exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.selenium_01utilities.BaseUtilityUpdated;

public class GetRandomRowDataUsingMap {
	//static int randomNumberInt;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		GetRandomRowDataUsingMap grdmp =new GetRandomRowDataUsingMap();
		
		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		//for random no.
		System.out.println(grdmp.randomNoGenerator("./ExcelFile/TestData.xlsx","Assignment"));
		getRandomRowDataUsingMap("./ExcelFile/TestData.xlsx","Assignment","Actor Name",grdmp.randomNoGenerator("./ExcelFile/TestData.xlsx","Assignment"));
		//for known row no.
		System.out.println("For Specific Row");
		getRandomRowDataUsingMap("./ExcelFile/TestData.xlsx","Assignment","Salary",1);
	}
	public int randomNoGenerator(String filePath,String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream (filePath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet(sheetName);
		
		Double min=1.0;
		Double totalRow=(double) s1.getLastRowNum();
		System.out.println(totalRow);
		//System.out.println(totalRow);
		double randomNumber=Math.random()*(totalRow-min+1)+min;
		int randomNumberInt=(int)randomNumber;
		//System.out.println(randomNumber);
		//System.out.println("Random Number:"+randomNumberInt);
		return randomNumberInt;
		
		
	}
	public static void getRandomRowDataUsingMap(String filePath,String sheetName,String keyName,int requiredRow) throws EncryptedDocumentException, IOException {
		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		FileInputStream fis = new FileInputStream (filePath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet(sheetName);

//		Double min=1.0;
//		Double totalRow=(double) s1.getLastRowNum();
//		//System.out.println(totalRow);
//		double randomNumber=Math.random()*(totalRow-min+1)+min;
//		int randomNumberInt=(int)randomNumber;
//
//		//System.out.println(randomNumber);
//		//System.out.println(randomNumberInt);
//		//System.out.println(s1.getFirstRowNum());
		HashMap<String,Object> testData=new HashMap<String,Object>();
		Object obj;
//		for(int i=0;i<=s1.getFirstRowNum();i++) {//0
			for(int j =0;j<s1.getRow(0).getLastCellNum();j++) {

				String key=s1.getRow(0).getCell(j).getStringCellValue();
				//Here need to use getObjectMethod to get 	
				obj =bu.getObjectOfParticularCell(filePath, sheetName, requiredRow, j);
				testData.put(key, obj);
			}
			System.out.println(testData);
			System.out.println(keyName+" :"+testData.get(keyName));
		}
		
	}



