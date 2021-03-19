package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F://Selenium//Software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getPageSource());
		
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);

		List<WebElement> dropdown = driver.findElements(By.xpath("//*[@id='month']/option"));
				for(int i=0; i<dropdown.size(); i++)
				{
					//System.out.println(dropdown.get(i).getText());
				}
	}
}
