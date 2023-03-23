package functionAndMethod;

import java.util.Scanner;

public class factorial {

	public factorial() {
		// TODO Auto-generated constructor stub
	}
	public static int fact(int x) {
		int factOfN = x>=0 ? 1 : 0;
		for(int i=x; i>=1; i--) {
			factOfN = factOfN*i;
		}
		return factOfN;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fact(num));
	}
}
