package arraysInJava;

import java.util.Arrays;
import java.util.Scanner;

public class practiseQuestion {

	public practiseQuestion() {
		// TODO Auto-generated constructor stub
	}
//// 1.	Question - LINEAR SEARCH
//	Qs. Take an array as input from the user. Search for a
//	given number x and print the index at which it occurs.
	
	public static int[] arrayInput(int size) {
		int arr[] = new int[size];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static int arrayElementToFind(int arrElement, int arr[]) {
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arrElement) {
				index = i;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		System.out.println("Enter "+size+" elements of array : ");
		int arry[] = arrayInput(size);
		System.out.println("Array that you have entered is : "+Arrays.toString(arry));
		System.out.println("Enter the elements you need to find : ");
		int a = sc.nextInt();
		int ans  = arrayElementToFind(a, arry);
		System.out.println("The element "+a+" is present at index : "+ans);
	}
}
