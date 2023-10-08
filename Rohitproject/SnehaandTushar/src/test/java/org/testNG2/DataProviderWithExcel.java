package org.testNG2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.selenium_01utilities.BaseUtilityUpdated;

public class DataProviderWithExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		getDataAndProvideData("./ExcelFile/TestData.xlsx","userData");
	}
	public static Object[][] getDataAndProvideData(String filePath,String sheetData) throws EncryptedDocumentException, IOException{
		BaseUtilityUpdated bu =new BaseUtilityUpdated();	
		int last_row=bu.getlastRowNumber(filePath,sheetData);
		int last_cell=bu.getlastCellNumber(filePath,sheetData);
		//System.out.println(last_row);
		//System.out.println(last_cell);
		Object ar[][]=new Object[last_row][last_cell];
		//int k = 0;
		//int l = 0;
		for (int i=1,k=0;i<=last_row;i++,k++) {//1//2
			for(int j = 0,l=0;j<last_cell;j++,l++) {//0

				ar[k][l]=bu.getObjectOfParticularCell(filePath,sheetData,i,j);

				//System.out.println(ar[k][l]);
			}
		}
		return ar;
	}
}	


