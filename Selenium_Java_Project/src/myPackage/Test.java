package myPackage;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		String str = "aaabbccc";
		/*
		 * HashMap<Character, Integer> hMap = new HashMap<>(); for (int i =
		 * str.length()-1; i >= 0; i--) {
		 * 
		 * if (hMap.containsKey(str.charAt(i))) { int count = hMap.get(str.charAt(i));
		 * hMap.put(str.charAt(i), ++count); } else { hMap.put(str.charAt(i), 1); } }
		 * System.out.println(hMap);
		 *

		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (hmap.containsKey(str.charAt(i))) {
				int count = hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), ++count);
			}
			else {
				hmap.put(str.charAt(i), 1);
			}
		}
		System.out.println(hmap);*/
		
		
		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = str.length()-1; i >=0; i--) {
			if(hmap.containsKey(str.charAt(i)))
			{
				int count = hmap.get(str.charAt(i));
				hmap.put(str.charAt(i), ++count);
			}
			else {
				hmap.put(str.charAt(i), 1);
			}
		}System.out.println(hmap);
	}
}
