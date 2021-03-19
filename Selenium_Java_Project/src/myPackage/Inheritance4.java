package myPackage;

public class Inheritance4 extends Inheritance3 {

	public void multiplication(int a, int b) {
		i = a * b;
		System.out.println("Multiplication : " + i);
	}

	public static void main(String[] args) {
		int a = 20, b = 30;

		Inheritance4 i4 = new Inheritance4();

		i4.addition(25, 50);
		i4.subtraction(50, 35);
		i4.multiplication(5, 11);
		i4.addition(a, b);

	}
}
