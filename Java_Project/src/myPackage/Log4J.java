package myPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4J {

	public static void main(String[] args) throws Exception {
		
		//we need to create Logger instance so we need to pass class name for which we want to create log file
		//in this case class name is Log4J
		org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("Log4J");
		
		// Configure Log4J properties file
		PropertyConfigurator.configure("C:\\Users\\Tejas\\eclipse-workspace\\Java_Training\\log4j.properties");

		//Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("ChromeBrowser Opened");
		
		//Maximize the Window
		driver.manage().window().maximize();
		logger.info("Window Maximized");
		
		//Set Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Implicit Wait given");
		
		//Open URL
		driver.get("https://www.facebook.com");
		logger.info("Facebook applcation opened");
		Thread.sleep(5000);
		driver.close();
	}

}
