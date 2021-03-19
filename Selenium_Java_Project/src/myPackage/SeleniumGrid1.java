package myPackage;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumGrid1 {

	@Test(dataProvider = "sendData")
	public void login(String UserName, String BrowserName) throws Exception {

		DesiredCapabilities cap = null;
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome is opening your application");
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}

		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys(UserName);
	}

	@DataProvider(parallel = true)
	public Object[][] sendData() {
		
		Object arr[][] = new Object[2][2];

		arr[0][0] = "Email_1";
		arr[0][1] = "chrome";
		
		arr[1][0] = "Email_2";
		arr[1][1] = "chrome";
		
		return arr;

	}
}