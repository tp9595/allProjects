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

public class GetDataOfAnyCellWithRespectToTableHeading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		BaseUtilityUpdated bu = new BaseUtilityUpdated();
		int number =bu.randomNumberGenerator("./ExcelFile/TestData.xlsx","DummySheet");
		System.out.println(number);
		//get random row data
		System.out.println(bu.returnDataOfAnyCellWithRespectToTableHeading("./ExcelFile/TestData.xlsx","DummySheet","Actor Name",bu.randomNumberGenerator("./ExcelFile/TestData.xlsx","Assignment")));
		//get row data by choice 
		System.out.println(bu.returnDataOfAnyCellWithRespectToTableHeading("./ExcelFile/TestData.xlsx","DummySheet","Actor Name",2));
	}
}
