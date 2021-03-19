package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2doB4z\']")).click();
		
		//Creating Web Elements reference
		WebElement Electronics = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"));
		WebElement Mens = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[3]"));
		
		// Mouse Simulation using Actions Class
		Actions act = new Actions(driver);
		
		//Mouse hover to Electronics web element
		Thread.sleep(3000);
		act.moveToElement(Electronics).build().perform();
		
		//Mouse hover to Mens web element
		Thread.sleep(3000);
		act.moveToElement(Mens).build().perform();
		
		//Right click on Electronics
		Thread.sleep(3000);
		act.contextClick(Electronics).build().perform();
		
		//Release control from Electronics
		Thread.sleep(3000);
		act.release(Electronics).build().perform();
		
		// Performing Key Events
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Key Entered");
		
		// Performing key event on Mens Web element
		Thread.sleep(3000);
		act.sendKeys(Mens, Keys.ENTER).build().perform();
		System.out.println("Successfully Executed");
	}
}
