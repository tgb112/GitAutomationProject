package myPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	@Test
	public void a2()
	{
		System.out.println("a2 Test method");
		System.out.println();
	}
	
	@BeforeTest
	public void b()
	{
		System.out.println("BeforeTest method");
	}

	@BeforeSuite
	public void c()
	{
		System.out.println("BeforeSuite method");
	}
	
	@AfterMethod
	public void d()
	{
		System.out.println("AfterMethod method");
	}
	
	@BeforeClass
	public void e()
	{
		System.out.println("BeforeClass method");
	}
	
	@AfterTest
	public void f()
	{
		System.out.println("AfterTest method");
	}
	
	@AfterClass
	public void g()
	{
		System.out.println("AfterClass method");
	}
	
	@BeforeMethod
	public void h()
	{
		System.out.println("BeforeMethod method");
	}
	
	@AfterSuite
	public void i()
	{
		System.out.println("AfterSuite method");
	}
	
	@Test
	public void a1()
	{
		System.out.println("a1 Test method");
	}
}