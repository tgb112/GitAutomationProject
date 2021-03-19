package myPackage;

public class Inheritance10 extends Inheritance8 {

	public void sleep() {
		System.out.println("I am Sleeping");
	}

	public static void main(String[] args) {
		Inheritance10 i10 = new Inheritance10();
		i10.eat();
		i10.sleep();
	}
}
