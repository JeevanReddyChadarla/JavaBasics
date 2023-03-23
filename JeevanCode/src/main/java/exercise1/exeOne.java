package exercise1;

import java.util.Scanner;

public class exeOne {

	public exeOne() {
		// TODO Auto-generated constructor stub
	}
	
////	1.Enter 3 numbers from the user & make a function to print their average.
	
//	public static float avgOfThree(int a, int b, int c) {
//		float average = (a+b+c)/3f;
//		return average;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int z = sc.nextInt();
//		System.out.println(avgOfThree(x, y, z));
//	}
	
////	2. Write a function to print the sum of all odd numbers from 1 to n.
	
//	public static int sumOfOdds(int n) {
//		int sum = 0;
//		for(int i=1;i<=n;i++) {
//			if(i%2==1) {
//			sum += i;
//		}
//		}
//		return sum;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		System.out.println(sumOfOdds(x));
//	}
	
////	3. Write a function which takes in 2 numbers and returns the greater of those two.

//		public static int greatOfTwo(int x, int y) {
//			int greater = x>y ? x : y;
//			return greater;
//		}
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(greatOfTwo(a, b));
//		}

////	4. Write a function that takes in the radius as input and returns the circumference of a circle.

//	public static double circumOfCircle(double r) {
//		double circumference = 2*22*r/7;
//		return circumference;
//	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		double radius = sc.nextDouble();
//		System.out.println(circumOfCircle(radius));
//	}
	
////	5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
////	7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
////	8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

//		public static double powOfN(int x, int n) {
//			double power=1;
//			for(int i=1;i<=n;i++) {
//				power = x * power;
//			}
//			return power;
//		}
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(powOfN(a, b));
//		}
	
////	10. Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 .....
	
		public static void fibonacciSeries(int n) {
			int temp=0, a=0, b=1;
			for(int i=1;i<=n;i++) {
				temp = a+b;
				System.out.println(temp);
				a=b;
				b=temp;
			}
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			fibonacciSeries(a);
	}
}
