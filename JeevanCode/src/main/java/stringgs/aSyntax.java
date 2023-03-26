package stringgs;

import java.util.Arrays;
import java.util.Scanner;

public class aSyntax {

	public aSyntax() {
		// Strings are immutable 
	}
	//// syntax
//	String name = "Jeevan Reddy";
//	String name = sc.next(); ---> Jeevan
//	String name = sc.nextLine(); ---> Jeevan Reddy
	
// String length ----------> string1.length();
// String concatination ---> string1+string2;

//	public static String concatination(String firstName, String secondName) {
//		String fullName = firstName+secondName;
//		return fullName;
//	}
//	public static void main(String[] args) {
//		String fullName = concatination("Jeevan", "Chadarla");
//		System.out.println(fullName);
//		System.out.println(fullName.length());
//	}

// print each character of a string - charAt(int)
	
//	public static String returnEachCharOfString(String name) {
//		char characters[] = new char[name.length()];
//		for(int i=0;i<name.length();i++) {
//			characters[i]=name.charAt(i);
//		}
//		return Arrays.toString(characters);
//	}
//	public static void main(String[] args) {
//		String chars = returnEachCharOfString("Jeevan");
//		System.out.println(chars);
//	}

// Compare two strings -----> == OR compareTo
// Strings are stored as Objects in java
//		*compareTo - compares the values of two objects--- prefer to use
			//1 s1 > s2 : +ve value
			//2 sl == s2: 0
			//3 s1 < s2 : -ve value
//		== compares the addresses of two objects
//	public static boolean compareTwoStrings(String strOne, String strTwo) {
//		boolean flag=false;
//		if(strOne==strTwo) {
//			flag=true;
//		}
//		return flag;
//	}
//	public static int compareTo(String strOne, String strTwo) {
//		int count= strOne.compareTo(strTwo);
//		return count;
//	}
//	public static void main(String[] args) {
//		boolean flag = compareTwoStrings("Jeevan", "Jeevan");// true - strOne and strTwo points to same object(same address) since the values are same
//		System.out.println(flag);
//		boolean flag = compareTwoStrings(new String("Jeevan"), new String("Jeevan")); // false - strOne and strTwo points to two different object(new, different address)
//		System.out.println(flag);
//		int x = compareTo("Jeevan", "Zeevan");
//		System.out.println(x);
//	}
	
// substring - 
//	syntax - strOne.substring(index beginning, index ending)
	public static void main(String[] args) {
		String name = "JeevanChadarla";
		System.out.println(name.substring(6,name.length()));
	}
}
