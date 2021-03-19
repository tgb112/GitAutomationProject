package myPackage;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionExample {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Tejas");
		al.add("Tushar");
		al.add("Aniket");
		al.add("Rani");
		al.add("Ganesh");

		System.out.println("Before sorting : " + al);

		Collections.sort(al);
		System.out.println("Ascending order : " + al);

		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Decending order : " + al);
	}

}
