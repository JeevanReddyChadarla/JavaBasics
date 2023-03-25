package arraysTwoDInJava;

import java.util.Arrays;
import java.util.Scanner;

public class practiseQuestion {

	public practiseQuestion() {
		// TODO Auto-generated constructor stub
	}

//// Q1. Take a matrix as input from the user. Search for a
//	given number x and print the indices at which it occurs.
	
	public static String returnArrayInput(int rows, int columns, int element){
		int arr[][] = new int[rows][columns];
		Scanner sc = new Scanner(System.in);
		int found[] = new int[2];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array you entered is : "+Arrays.deepToString(arr));
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(element == arr[i][j]) {
					found[0] = i;
					found [1] = j;
				}
			}
		}
		return Arrays.toString(found);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number of rows : ");
		int rows=sc.nextInt();
		System.out.println("number of columns : ");
		int columns = sc.nextInt();
		System.out.println("Enter the element you need to search : ");
		int element = sc.nextInt();
		System.out.println("The element "+element+" is present at index : "+returnArrayInput(rows, columns,element));
	}
	
}
