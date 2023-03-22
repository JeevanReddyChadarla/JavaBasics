package loops;

import java.util.Scanner;

public class whileLoop {

//// Syntax
//	int i = 0;
//	while(condition i<10) {
//		execute statement;
//		i++;
//	}
	
	public whileLoop() {
		// TODO Auto-generated constructor stub
	}
	
	//// Sum of n Natural numbers
//	public static int sumOfNum(int n) {
//		int sum = 0,i = 0;
//		while(i<=n) {
//			sum=sum+i;
//			i++;
//		}
//		return sum;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number : ");
//		int n = sc.nextInt();
//		System.out.println("Sum of "+n+" numbers is : "+sumOfNum(n));
//	}
	
	////Print the pattern
//	*****
//	*****
//	*****
//	*****
	public static void printPattern(int l, int b) {
		int i =0, j=1;
		while(i<b) {
			while(j<l) {
				System.out.print("*");
				j++;
			}
			j=1;
			System.out.println("*");
			i++;
		}
	}
	public static void main(String[] args) {
		printPattern(5, 4);
	}

}
