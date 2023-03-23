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
	
////7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

//	public static void main(String[] args) {
//		char choice;
//		int number;
//		int posCount = 0, negCount = 0, zerCount = 0;
//		Scanner sc = new Scanner(System.in);
//		do {
//			number = sc.nextInt();
//			if(number>0)
//				posCount++;
//			else if(number<0)
//				negCount++;
//			else
//				zerCount++;
//			choice = sc.next().charAt(0); // after entering every number the program waits for 'y'
//		}while(choice == 'y');
//		System.out.println("+ve num count : "+posCount+" -ve num count : "+negCount+"zero num count : "+zerCount);
//	}

}
