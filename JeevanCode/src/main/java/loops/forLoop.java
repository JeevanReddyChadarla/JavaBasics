package loops;

import java.util.Scanner;

public class forLoop {

//// syntax 
//	for(initialisation; condition; updation){
//	execute statement
//}
	
	public forLoop() {
		// TODO Auto-generated constructor stub
	}

	////Sum of n Natural numbers
//	public static int sumOfNum(int n) {
//		int sum = 0;
//		for(int count=0;count<=n;count++) {
//			sum = sum+count;
//		}
//		return sum;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the value of n : ");
//		int n = sc.nextInt();
//		System.out.println("Sum of n Natural numbers is : "+sumOfNum(n));
//	}
	
	////Print the pattern
//	*****
//	*****
//	*****
//	*****
//	public static void printPattern(int l, int b) {
//		for(int i=0;i<b;i++) {
//			for(int j=0;j<l;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}
//	public static void main(String[] args) {
//		printPattern(5, 4);
//	}
	
	////Print Pattern-2
//	*****
//	*	*
//	*	*
//	*****
	public static void printPattern2(int l, int b) {
		for(int i=1;i<=b;i++) {
			for(int j=1;j<=l;j++) {
				if(i==1 || i==b || j==1 || j==l) {
					System.out.print("*");
				}else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printPattern2(5, 4);
	}
}
