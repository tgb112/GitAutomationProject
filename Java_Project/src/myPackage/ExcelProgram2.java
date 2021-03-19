package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelProgram2 extends ExcelProgram{

	ExcelProgram e = new ExcelProgram();
	@Test
	public void loginCheck()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.id("pass")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());
		driver.findElement(By.name("login")).click();
		driver.findElement(By.id("pass")).sendKeys(sh.getRow(2).getCell(1).getStringCellValue());

		driver.findElement(By.name("login")).click();
	}
}