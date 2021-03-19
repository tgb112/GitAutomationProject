package myPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		
		File source = new File("C:\\Users\\Tejas\\eclipse-workspace\\Java_Training\\Repository\\Object_Repo.properties");
		
		FileInputStream fis = new FileInputStream(source);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		
		driver.findElement(By.xpath(pro.getProperty("EmailOrPhone"))).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys("213123");
	}

}
