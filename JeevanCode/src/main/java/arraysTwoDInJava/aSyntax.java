package arraysTwoDInJava;

import java.util.Arrays;
import java.util.Scanner;

public class aSyntax {

	public aSyntax() {
		// TODO Auto-generated constructor stub
	}

	//// syntax
//	1. dataType arrayName[][] = new dataType[rows][columns];
// for 1D arrays - Arrays.toString(arr) prints the value in array format
// for 2D arrays - Arrays.deepToString(arr) prints the value in array 2D format 
	
	public static int[][] printTwoDimArray(int a, int b){
		Scanner sc = new Scanner(System.in);
		int twoDimArr[][] = new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				twoDimArr[i][j] = sc.nextInt();
			}
		}
		return twoDimArr;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(printTwoDimArray(2, 3)));
	}
}
