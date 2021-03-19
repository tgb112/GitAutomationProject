package myPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelProgram {

	static WebDriver driver;
	
	public void Excel() throws Exception {
	
		// GetData from Excel
		File source = new File("F:\\Selenium\\Login.xls");
		FileInputStream fis = new FileInputStream(source);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sh = wb.getSheet("Sheet1");
		HSSFRow row3=sh.createRow(3);
		
		
		
	}
}