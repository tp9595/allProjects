package excelop;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
// in data driven testing we use this coz we mostly teke the dat afrom excel
public class testngpracticeinexcel {
	String appurl,userNAME,password ;
	public String readtestdata(String filpath,String sheetname,int rowNum, int cellNum) throws IOException
	{
		FileInputStream fis = new FileInputStream(filpath); //C:\Users\akshay\eclipse-workspace\Maven\excelfile\jii.xlsx
		// Workbook workbook = WorkbookFactory.create(fis);
		Workbook workbook1 = new XSSFWorkbook(fis);
		// workbook.
		 Sheet sheet = workbook1.getSheet(sheetname);
		 
		 Row row =sheet.getRow(rowNum);
		 Cell cell = row.getCell(cellNum);
		 
		 
		return cell.getStringCellValue();
	}
	
	
	
	
	
	
	
	@BeforeTest
	public void firstmethod() throws IOException
	{
		appurl =readtestdata("C:\\Users\\akshay\\Desktop\\3PL.xlsx","3pldetail",1,0);
		userNAME =readtestdata("C:\\Users\\akshay\\Desktop\\3PL.xlsx","3pldetail",1,1);
		password =readtestdata("C:\\Users\\akshay\\Desktop\\3PL.xlsx","3pldetail",1,2);
		
	}
	
	

}
