package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MasterPage {
	public static WebDriver driver;
	public Properties prop;
	public Properties or;

	// Constructor
	public MasterPage() throws Exception {

		Logger logger = Logger.getLogger("Log4J");
		PropertyConfigurator.configure(
				"F:\\eclipse-workspace\\Selenium_Java_Project\\src\\com\\facebook\\resources\\log4j.properties");
		BasicConfigurator.configure();

		// configuration properties file
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);

		// locators.properties
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\locators.properties");
		or = new Properties();
		or.load(fs);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\eclipse-workspace\\Selenium_Java_Project\\com.facebook.drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"F:\\eclipse-workspace\\Selenium_Java_Project\\src\\com\\facebook\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Open IE Browser");
		}

		logger.info("Browser Launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		logger.info("Facebook opened");

		/* File src = new File(
		 * "F:\\eclipse-workspace\\Selenium_Java_Project\\src\\com\\facebook\\resources\\LoginData.xlsx"
		 * ); FileInputStream fis = new FileInputStream(src); XSSFWorkbook wb = new
		 * XSSFWorkbook(fis); XSSFSheet sh = wb.getSheet("DemoSheet");
		 */
	}

	public void click(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}

	public void sendData(String xpathkey, String data) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(data);
	}
}