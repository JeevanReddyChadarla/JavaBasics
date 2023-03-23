package exercise1;

import java.util.Scanner;

public class challengingQuestions {

	public challengingQuestions() {
		// TODO Auto-generated constructor stub
	}

////7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

	public static void main(String[] args) {
		char choice;
		int number;
		int posCount = 0, negCount = 0, zerCount = 0;
		Scanner sc = new Scanner(System.in);
		do {
			number = sc.nextInt();
			if(number>0)
				posCount++;
			else if(number<0)
				negCount++;
			else
				zerCount++;
			choice = sc.next().charAt(0); // after entering every number the program waits for 'y'
		}while(choice == 'y');
		System.out.println("+ve num count : "+posCount+" -ve num count : "+negCount+"zero num count : "+zerCount);
	}
}
