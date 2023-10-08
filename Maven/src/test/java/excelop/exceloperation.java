package excelop;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceloperation {

	public void exce() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\akshay\\Desktop\\eclipse practice.xlsx"); // C:\Users\akshay\eclipse-workspace\Maven\excelfile\jii.xlsx
		// Workbook workbook = WorkbookFactory.create(fis);
		Workbook workbook = new XSSFWorkbook(fis);
		// workbook.

		int sheetCount = workbook.getNumberOfSheets();
		System.out.println("sheetcount=" + sheetCount);
		System.out.println("active sheet:" + workbook.getActiveSheetIndex());
		for (int i = 0; i < sheetCount; i++) {
			System.out.println(workbook.getSheetName(i));

		}

		// calculate the row of the sheet
		Sheet sheet = workbook.getSheet("program2");
		int rowcount = sheet.getLastRowNum();
		System.out.println("row count" + rowcount);

		// calculate the cell

		Sheet sheeta = workbook.getSheet("program2");
		Row row = sheeta.getRow(0);
		Row row1 = sheeta.getRow(2);
		System.out.println("cell count" + row.getLastCellNum());

		// read the value of cell

		for (int i = 0; i < row.getLastCellNum(); i++) {
			System.out.print(row.getCell(i).getStringCellValue() + "\t");

		}
		System.out.println();
		for (int i = 0; i < row1.getLastCellNum(); i++) {
			System.out.print(row1.getCell(i).getStringCellValue() + "\t");

		}
		System.out.println("read value of cell");
 
//		  Row row1 =sheet.getRow(1);
//		  for(int i=0; i < row1.getLastCellNum(); i++)
//			{
//				System.out.print(row1.getCell(i).getStringCellValue() +"\t");
//				
//			}
//		  System.out.println();

		// read the all type of data in excel
		Sheet sheeta1 = workbook.getSheet("program2");

		Row row2 = sheet.getRow(1);
		for (int i = 0; i < row2.getLastCellNum(); i++) {
			Cell cell = row2.getCell(i);
			switch (cell.getCellType()) {
			case STRING:
				System.out.print(cell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.print(cell.getNumericCellValue());
				break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			case BLANK:
				System.out.println(cell.getStringCellValue());
				break;
			default:
				throw new RuntimeException("there is no support for this type");
			}
			System.out.println();

		}
		// to get the value of first row and first cell
		Sheet sheet2 = workbook.getSheet("program2");
		for (int i = 0; i < sheet2.getLastRowNum(); i++) {
			System.out.print(sheet2.getRow(i).getCell(0).getStringCellValue() + "\t");

		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		exceloperation obj = new exceloperation();
		obj.exce();
		// obj.rowopern();

	}

}
