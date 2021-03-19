package myPackage;

abstract class AbstractClass {

	public AbstractClass() {
		System.out.println("In Base class Constructor");
	}
	
	public static void display()
	{
		System.out.println("Tejas");
	}
	
	public static void main(String[] args) {
		AbstractClass.display();
	}
}