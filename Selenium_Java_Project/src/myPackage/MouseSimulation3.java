package myPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F://Selenium//Software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable");
		
		//Swithching frame
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames available on web page = " + allFrames.size());
		driver.switchTo().frame(0);
		
		//Will find draggable and droppable web element
		WebElement src = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//*[@id='droppable']"));
	
		//Using Actions Class, drag and drop the web element using src and dest
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
	}
	
}