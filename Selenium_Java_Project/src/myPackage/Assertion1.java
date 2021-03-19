package myPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	WebDriver driver;
	
	@Test
	public void testCase1() throws Exception
	{
		String expectedValue = "Sorry, we don't recognize this email.";
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
	
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('login-signin').click()");
		
		Thread.sleep(3000);
		String actualValue = driver.findElement(By.id("username-error")).getText();
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("Assertion Successful.");
	
		Assert.assertFalse(driver.findElement(By.id("username-error")).isSelected());
		System.out.println("Web Element is not Selected");
		
		Assert.assertTrue(driver.findElement(By.id("username-error")).isDisplayed());
		System.out.println("Web Element is displayed");
	}
}
