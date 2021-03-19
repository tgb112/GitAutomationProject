package myPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Test3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\Selenium_Java_Project\\com.facebook.drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		//jse.executeScript("window.scrollBy(0,-400)");
		
		
		SoftAssert s = new SoftAssert();
		s.assertTrue(2<1);
		System.out.println("Assertion failed");
		s.assertEquals("simple", "difficult");
		System.out.println("Assertion failed");
		//s.assertAll();
		
		Assert.assertTrue(2<1);
		System.out.println("Assertion Failed Test1");
		
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().getText();
		driver.

}
}