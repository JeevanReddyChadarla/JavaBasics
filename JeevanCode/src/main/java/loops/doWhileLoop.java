package loops;

import java.util.Scanner;

public class doWhileLoop {

////syntax
//	int i=0;
//	do {
//		execute statement;
//		i = i+1;
//	}while(condition i<11);
	
	public doWhileLoop() {
		// TODO Auto-generated constructor stub
	}

	public static int sumOfNum(int n) {
		int sum = 0, i=0;
		do {
			sum = sum + i;
			i++;
		}while(i<=n);
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		System.out.println("Sum of "+n+" numbers is : "+sumOfNum(n));
	}
}
