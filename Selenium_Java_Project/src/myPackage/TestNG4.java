package myPackage;

import org.testng.annotations.Test;

public class TestNG4 {

	@Test(priority = -10)
	public void a2()
	{
		System.out.println("a2 Test method");
	}
	
	@Test(priority = -20)
	public void b()
	{
		System.out.println("b Test method");
	}
	
	@Test(priority = 0)
	public void e()
	{
		System.out.println("e Test method");
	}
	
	@Test(priority = 1)
	public void c()
	{
		System.out.println("c Test method");
	}
	
	@Test
	public void g()
	{
		System.out.println("g Test method");
	}
	
	@Test
	public void G()
	{
		System.out.println("G Test method");
	}
	
	@Test(priority = 1)
	public void a1()
	{
		System.out.println("a1 Test method");
	}
	
	@Test(priority = 2)
	public void d()
	{
		System.out.println("d Test method");
	}
	
}
