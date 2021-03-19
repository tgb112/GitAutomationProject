package myPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {
	//How to skip test cases
	
	@Test(enabled = false)		//Test case will be ignored
	public void a()
	{
		System.out.println("a test method");
	}
	
	//@Test						//Test case existence will be finish due to commenting
	public void b()
	{
		System.out.println("b test method");
	}
	
	@Test(invocationCount = 0)	//Test case will not execute
	public void c()
	{
		System.out.println("c test method");
		
	}
	
	@Test(invocationCount = 2)
	public void d()
	{
		System.out.println("d test method");
	}
	
	@Test
	public void e()
	{
		System.out.println("e test method");
		throw new SkipException("Skipping a method");
		//System.out.println("Method Skipped");
	}
	
}
