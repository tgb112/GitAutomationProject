package myPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	WebDriver driver;
	org.apache.log4j.Logger logger;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
	
		logger = org.apache.log4j.Logger.getLogger("Log4J");		
		PropertyConfigurator.configure("C:\\Users\\Tejas\\git\\GitAutomationProject\\Java_Project\\log4j.properties");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");
			driver = new ChromeDriver();
			logger.info("Chrome Browser Launched");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Software\\geckodriver.exe");
			driver = new FirefoxDriver();
			logger.info("Firefox Browser Launched");
		} else {
			System.out.println("Wrong Browser");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logger.info("Maximized Browser");
	}

	@Test
	public void loginApp() throws Exception {
		driver.get("https://www.flipkart.com");
		logger.info("Navigate to URL");
		// driver.findElement(By.xpath("//*[@class=\"_1_3w1N\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8275340804");
		logger.info("Username entered..");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("tejas112");
		logger.info("Password entered..");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		logger.info("Clicked on Login Button");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Sneakers for Men");
		logger.info("Entered a product");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"L0Z3Pu\"]")).click();
		logger.info("Clicked on search");
		Thread.sleep(2000);
		driver.close();
		logger.info("Browser Closed");
	}
}
