package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable");
		
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames available on web page = " + allFrames.size());
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElement(By.xpath("//*[@id='draggable']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDropBy(src, 15, 15).build().perform();
		
		//Drag the web element and click and hold using coordinates
		Thread.sleep(3000);
		act.clickAndHold(src).dragAndDropBy(src, 10, 20).build().perform();
	}
}
