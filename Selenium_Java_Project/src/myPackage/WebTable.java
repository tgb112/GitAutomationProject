package myPackage;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies : " + allCompanies.size());
		
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total current Price : " + currentPrice.size());
		
		String companyName = "MCX";
		for (int i = 0; i < allCompanies.size(); i++) {
			if (allCompanies.get(i).getText().equalsIgnoreCase(companyName)) {
				System.out.println(allCompanies.get(i).getText() + "----" + currentPrice.get(i).getText());
				allCompanies.get(i).click();
				break;				
			}
		}
	}

}
