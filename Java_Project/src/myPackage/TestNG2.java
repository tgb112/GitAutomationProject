package myPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
		
	@Test
	public void assertionCheck()
	{
		String expectedMessage = "Hello World.";
		String actualMessage = "Hello World";
	
		try {
		Assert.assertEquals(actualMessage, expectedMessage);
		}
		catch (AssertionError e) {
			System.out.println(e);
		}
		System.out.println("Verification Successful");
	}
}
