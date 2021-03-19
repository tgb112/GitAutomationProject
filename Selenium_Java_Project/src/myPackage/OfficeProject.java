package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OfficeProject {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.0.110:6060/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("iadmin");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("iadmin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='div-square']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-md']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-md col-md-6']")).click();
		
		
		
		
	}

}
