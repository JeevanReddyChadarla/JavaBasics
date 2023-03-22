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
	public static int sumOfNum(int n) {
		int sum = 0;
		for(int count=0;count<=n;count++) {
			sum = sum+count;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n : ");
		int n = sc.nextInt();
		System.out.println("Sum of n Natural numbers is : "+sumOfNum(n));
	}

}
