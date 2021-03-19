package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {

		TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();
		
		@Test(priority = 1)
		public void doLogin() throws Exception
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");
			t1.driver = new ChromeDriver();
			t1.driver.manage().window().maximize();
			t1.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			t1.driver.get("https://facebook.com");
			Thread.sleep(3000);
			t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
			t1.driver.findElement(By.id("pass")).sendKeys("123456");
			
			//Passing wrong id so that our test case will fail
			t1.driver.findElement(By.id("Login1")).click();
		}
		
		@Test(priority = 2)
		public void assertionCheck()
		{
			System.out.println("Assertion Check");
		}
		
		@AfterMethod
		public void takeScreenshotOnFailure(ITestResult result) throws Exception
		{
			t1.captureScreenshot(result);
			t1.driver.quit();
		}	
}
