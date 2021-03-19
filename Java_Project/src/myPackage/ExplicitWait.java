package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		//setting property of chrome browser and passing chromddriver.exe file path
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);			
	}
}

