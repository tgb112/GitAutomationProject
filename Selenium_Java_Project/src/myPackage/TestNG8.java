package myPackage;

import org.testng.annotations.Test;

public class TestNG8 {
	
	@Test
	public void a2()
	{
		System.out.println("a2 test method");
	}
	
	@Test
	public void a()
	{
		System.out.println("a test method");
	}
	
	@Test
	public void s()
	{
		System.out.println("s test method");
	}
	
	@Test
	public void S()
	{
		System.out.println("S test method");
	}
	
	@Test(priority = 1)
	public void A()
	{
		System.out.println("A test method");
	}
	
	@Test
	public void A2()
	{
		System.out.println("A2 test method");
	}

}
