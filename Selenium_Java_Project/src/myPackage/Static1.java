package myPackage;

public class Static1 {
	int i = 10;	//non static variable
	static int b = 25;	//static variable
	
	public static void main(String[] args) {
		a();
		Static1 s1 = new Static1();
		s1.b();
	}
	
	// static method
	public static void a()
	{
		b = 5;
		System.out.println("a method called : " +b);
	}
	
	public void b()
	{
		b=20;
		System.out.println(b);
	}
}
