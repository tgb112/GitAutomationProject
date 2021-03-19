package myPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		//Verify alert text
		System.out.println("Alert text is : " + driver.switchTo().alert().getText());
		String ExpectedResult = "Please enter a valid user name";
		Assert.assertEquals(driver.switchTo().alert().getText(), ExpectedResult);
		System.out.println("Alert get verified");
		
		//To accept the alert - Handling alert
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		
		//To dismiss the alert
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	}

}
