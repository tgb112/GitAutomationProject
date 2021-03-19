package myPackage;

public class SwitchCase1 {

	public static void main(String[] args) {
		char c = 'a';

		switch (c) {
		case 1:
			System.out.println("Not Matched");
			break;

		case 'a':
			System.out.println("a Matched");
			break;
			
		case 45:
			System.out.println("Not Matched");
			break;

		default:
			System.out.println("Nothing Matched");
			break;

		case 5:
			System.out.println("Not Matched");
		}
	}
}