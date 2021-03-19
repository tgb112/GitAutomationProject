package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Introducing Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("How stuff works");
		
		//How to handle auto suggestions
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//*[@role='listbox']/li"));
		System.out.println("Total Size : " + allSuggestions.size());
		for (int i = 0; i < allSuggestions.size(); i++) {
			String finalResults = "How Stuff Works quiz";
			if(allSuggestions.get(i).getText().equalsIgnoreCase(finalResults))
			{
				allSuggestions.get(i).click();
				System.out.println(finalResults + " clicked");
				break;
			}
		}
	}
}