package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class WindowHandling {
	//static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");

	//	for (int i = 1; i <= 3; i++) {
			WebDriver driver = new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.navigate().to("https://google.com");
		
			int n = driver.getWindowHandles().size();
	        System.out.println(n);
			//driver.findElement(By.name("q")).sendKeys("I am in window ");
			
			//driver.navigate();
			System.out.println("Hello");
			
		/*}
		Set<String> PopupID = driver.getWindowHandles();
		Iterator<String> it = PopupID.iterator();
		String mainWindow = it.next();
		String window1 = it.next();
		String window2 = it.next();

		driver.switchTo().window(window1);
		driver.switchTo().window(window2);
		driver.switchTo().window(mainWindow);*/
	}
}