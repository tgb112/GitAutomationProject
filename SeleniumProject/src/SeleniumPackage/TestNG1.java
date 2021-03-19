package SeleniumPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG1 { 

	@Test
	public void a2() {
		System.out.println("a2 test method");
	}

	@Test
	public void a() {
		//System.out.println("skipped");
	throw new SkipException("a test method skipped");
	}

	@Test(enabled=false)
	public void s() {
		System.out.println("s test method");
	}

	@Test
	public void S() {
		System.out.println("S test method");
	}

	@Test(priority = 1)
	public void A() {
		System.out.println("A test method");
	}

	@Test
	public void A2() {
		System.out.println("A2 test method");
	}
}