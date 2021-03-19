package myPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG6 {
	
	@Test
	public void a()
	{
		System.out.println("a test method");
	}
	
	@Test(invocationCount = 2)
	public void b()
	{
		System.out.println("b test method");
	}
	
	@BeforeMethod
	public void c()
	{
		System.out.println("before test method");
	}
}
