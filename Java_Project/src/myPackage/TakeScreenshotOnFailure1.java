package myPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure1 {
	
	WebDriver driver;
	
	public void captureScreenshot(ITestResult result) throws Exception
	{
		if (ITestResult.FAILURE == result.getStatus() ) {
			
			//Creating reference of TakesScreenshot Interface and type casting
			TakesScreenshot ts = (TakesScreenshot) driver;	//Type casting of two interfaces
			
			//Call getScreenshotAs method to capture screenshot in terms of FILE
			//getScreenshotAs method return type is FILE
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			//Copy files to specific location
			//Dot Slash(./) means, I want to store images at project level in Screenshots
			//folder
			FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));
			System.out.println(result.getName() + " method() Screenshot captured");
		}
	}
}
