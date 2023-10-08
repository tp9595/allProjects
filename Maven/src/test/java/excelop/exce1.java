package excelop;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exce1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\akshay\\Desktop\\eclipse practice.xlsx"); // C:\Users\akshay\eclipse-workspace\Maven\excelfile\jii.xlsx
		// Workbook workbook = WorkbookFactory.create(fis);
		Workbook workbook = new XSSFWorkbook(fis);
		// workbook.

		int sheetCount = workbook.getNumberOfSheets();
		System.out.println("sheetcount=" + sheetCount);
		System.out.println("active sheet:" + workbook.getActiveSheetIndex());
		Sheet sheet1=workbook.getSheet("program2");
		Row row1 =sheet1.getRow(0);
		int physicalNumberOfCells=row1.getPhysicalNumberOfCells();
		System.out.println("physicalNumberOfCells "+physicalNumberOfCells);
		
	}

}
