package myPackage;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel1 {

	public static void main(String[] args) throws Exception {
		
		//Specify the path of excel file
		File src = new File("C:\\Users\\Tejas\\eclipse-workspace\\Selenium_Java_Project\\src\\com\\facebook\\resources\\LoginData.xlsx");
		
		//Load the file
		FileInputStream fis = new FileInputStream(src);
		
		//load the workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//load the sheet
		XSSFSheet sh = wb.getSheet("DemoSheet");
		
		//get the name of loaded sheet
		System.out.println(sh.getSheetName());
		
		//print Username from excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		//print numeric value from excel sheet
	//	System.out.println(sh.getRow(1).getCell(1).getNumericCellValue());
	
		//print total number of rows - 1st way
		System.out.println(sh.getPhysicalNumberOfRows());
		
		//print total number of rows - 2nd way
		System.out.println(sh.getLastRowNum()+1);
		
		//print total number of rows - 3rd way
		int rows = sh.getLastRowNum()+1;
		
		//print first number of row
		System.out.println(sh.getFirstRowNum());
		
		//print total number of columns
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());
		
		//print total number of columns
		System.out.println(sh.getRow(1).getLastCellNum());
		
		//print total number of columns
		int columns = sh.getRow(0).getPhysicalNumberOfCells();
		
		//print all cells of excel sheet
		for (int i = 0; i <rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
	
	}

}
