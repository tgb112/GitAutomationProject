package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Software/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		//driver.findElement(By.cssSelector("#u_0_2")).click();
		Thread.sleep(3000);
		
		//1st Way - Not recommended but industry used mostly
		List<WebElement> bm = driver.findElements(By.xpath("//*[@id='month']/option"));
		System.out.println("Total Dropdown values are : " + bm.size());
		
		bm.get(8).click();
		System.out.println(bm.get(2).isEnabled()); //Checking if Feb is enabled or not
	
		//2nd Way - Recommended
		WebElement birthMonth = driver.findElement(By.xpath("//*[@id='month']"));
		// Will use Select class as a constructor
		Select month = new Select(birthMonth);
		month.selectByIndex(0);
		Thread.sleep(3000);
		month.selectByValue("12");
		Thread.sleep(3000);
		month.selectByVisibleText("May");
		Thread.sleep(3000);
		System.out.println(month.getFirstSelectedOption().getText());

		//3rd Way - we are storing all dropdown values in list
		List<WebElement> dropdown = month.getOptions();
		for(int i=0; i<dropdown.size(); i++)
		{
			System.out.println(dropdown.get(i).getText());
			/*
			String dropDownValues = dropdown.get(i).getText();
			//Thread.sleep(3000);
			if(dropDownValues.equalsIgnoreCase("Sep"))
			{
				dropdown.get(i).click();
				// or
				// month.selectByVisibleText(dropDownValues);
			}*/
		}
		
		//4th Way - checking the dropdown is supporting multiple values or not
		// Return type - Boolean
		
		System.out.println(month.isMultiple());
		month.selectByIndex(5);
		month.selectByValue("6");
		month.selectByVisibleText("Mar");
		//month.deselectByIndex(5);
		//month.deselectByValue("6");
		//month.deselectByVisibleText("Mar");
		//month.deselectAll();
		
		//5th Way
		birthMonth.sendKeys("Apr");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='month']")).sendKeys("Jul");;
		
		Thread.sleep(3000);
		driver.close();
	}

}
 