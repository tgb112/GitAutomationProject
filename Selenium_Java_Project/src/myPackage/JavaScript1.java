package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='123566'");
		
		
		//jse.executeScript("document.getElementById('u_0_2').click()");
		
		jse.executeScript("window.scrollBy(0, 400)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, -400)");
	}

}
