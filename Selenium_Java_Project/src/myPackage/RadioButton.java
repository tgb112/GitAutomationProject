package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		//setting property of chrome browser and passing chromddriver.exe file path
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
	
		//it is not good approach to handle multiple web elements
		driver.findElement(By.xpath("//input[@value='1']")).click(); //clicking on female radio button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click(); //clicking on male radio button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='-1']")).click(); //clicking on custom radio button
		Thread.sleep(3000);
		
		//Creating a list for all radio buttons
		List<WebElement> radios = driver.findElements(By.xpath("//input[contains(@type, 'radio')]"));
		System.out.println("Total Radio Buttons : " + radios.size());
		
		Thread.sleep(3000);
		System.out.println(radios.get(0).isEnabled()); //Female radio button is enabled or not
		System.out.println(radios.get(1).isDisplayed()); //Male radio button is displayed or not
		System.out.println(radios.get(2).isSelected()); //Custom radio button is selected or not
		Thread.sleep(3000);
		radios.get(1).click();
		System.out.println(radios.get(2).isSelected()); //Custom radio button is selected or not
		
		/*
		List<WebElement> radio1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		String expectedResults = "Male";
		for(int i=0; i<radio1.size(); i++)
		{
			if(radio1.get(i).getText().equalsIgnoreCase(expectedResults))
			{
				radio1.get(i).click();
				System.out.println(expectedResults + " clicked");
				break;
			}
		}*/
		
	}
}
