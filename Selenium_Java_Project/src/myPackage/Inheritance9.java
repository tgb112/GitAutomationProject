package myPackage;

public class Inheritance9 extends Inheritance8{

	public void cook() {
		System.out.println("I am cooking");
	}
	
	public static void main(String[] args) {
		Inheritance9 i9 = new Inheritance9();
		i9.cook();
		i9.eat();
	}
}
