package myPackage;

public class Array1 {

	public static void main(String[] args) {
		int a[] = new int[5];
		
		a[1] = 6 & 5;  // 0110 & 0101 = 0100 = 4
		a[0] = 9;
		a[2] = 51;
		a[3] = 14;
		a[4] = 34;
		
		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Value of a[" +i+"] = " + a[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Value of a[" +i+"] = " + a[i+1]);
		}
	}

}
