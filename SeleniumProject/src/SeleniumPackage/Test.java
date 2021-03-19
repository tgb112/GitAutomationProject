package SeleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total Rows : " + rows.size());
		/*
		 * List<WebElement> column =
		 * driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		 * System.out.println("Total columns : " + column.size());
		 * 
		 * List<WebElement> totalData =
		 * driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		 * System.out.println("Total columns : " + totalData.size());
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(rows.get(i).getText());
		}
	}
}