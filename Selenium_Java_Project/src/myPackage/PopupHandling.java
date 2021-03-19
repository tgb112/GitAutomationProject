package myPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		
		Thread.sleep(3000);
		Set<String> PopupID = driver.getWindowHandles();
		System.out.println(PopupID);
		System.out.println(PopupID.size());
		
		Iterator<String> it = PopupID.iterator();
		String mainWindow = it.next();
		String popupwindow1 = it.next();
		String popupWindow2 = it.next();
		System.out.println(driver.getTitle());
		
		//Print the title of pop up window 1
		Thread.sleep(2000);
		driver.switchTo().window(popupwindow1);
		System.out.println(popupwindow1);
		System.out.println(driver.getTitle());
		driver.close();
		
		//print the title of pop up window 2
		Thread.sleep(2000);
		driver.switchTo().window(popupWindow2);
		System.out.println(driver.getTitle());
		driver.close();
		
		//print the title of main window
		Thread.sleep(2000);
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}