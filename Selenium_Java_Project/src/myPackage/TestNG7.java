package myPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 {

	@Test(alwaysRun = false)
	public void a()
	{
		Assert.assertTrue(3>12);
		System.out.println("a test method");
	}
	
	@Test(dependsOnMethods = {"a"})
	public void b()
	{
		System.out.println("b method is dependent on a test method");
	}
	
	
}
