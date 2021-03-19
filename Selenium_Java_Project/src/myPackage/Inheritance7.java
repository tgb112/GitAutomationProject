package myPackage;

public class Inheritance7 extends Inheritance6{

	public void watch()
	{
		System.out.println("I am watching TV");
	}
	
	public static void main(String[] args) {
		
		Inheritance7 i7 = new Inheritance7();
		
		i7.read();
		i7.write();
		i7.watch();
	}
}
