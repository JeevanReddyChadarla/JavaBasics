package loops;

import java.util.Scanner;

public class ifLoop {

	public ifLoop() {
		// TODO Auto-generated constructor stub
	}
//// check if age is more than 18 or not
//	public static boolean major(int x) {
//		boolean val = x>18 ? true : false;
//		System.out.println("you are a "+val+" major");
//		return val;
//	}

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter your age : ");
//		int age = sc.nextInt();
//		major(age);
//	}

//// check if a number is even or odd
//	public static String odOrEv(int x) {
//		String type = x%2==0 ? "even" : "odd";
//		return type;
//	}
	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a positive number : ");
//		int num = sc.nextInt();
//		System.out.println("The num is "+odOrEv(num));
//	}
	
//// Take 3 number inputs and check >,<,=
//	public static String numComp(int a, int b) {
//		String comp = (a>b) ? a+" is greater" : a+" is lesser";
//		return comp;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the numbers : ");
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		System.out.println(numComp(m,n));
//	}

//// Switch case break 
	public static String swiCasBrk(int x) {
		String greet;
		switch (x) {
		case 1:{
			greet = "Hello";
		}
			break;
		case 2:{
			greet = "Welcome";
		}
			break;
		case 3:{
			greet = "Boss";
		}
			break;
		default:
			greet = "Jeevan";
			break;
		}
		return greet;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = sc.nextInt();
		System.out.println(swiCasBrk(x));
	}
}
