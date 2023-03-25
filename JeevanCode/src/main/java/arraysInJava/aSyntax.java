package arraysInJava;

public class aSyntax {

	public aSyntax() {
		// TODO Auto-generated constructor stub
	}
	//// Syntax 
//	indexing starts with 0 - arr[0], arr[1], arr[2]....
//	memory allocation - 
//	when we declare the size of an array while creating the array,
//	with the given size a memory will be allocated in memeory 

//	1. dataType arrayName[] = new dataType[sizeOfArray];
//	2. dataType arrayName[] = {num1, num2, num3};
	
	
//// Syntax 1
//	public static void main(String[] args) {
//		int arr[] = new int[3];
//		arr[0] = 20;
//		arr[1] = 52;
//		arr[2] = 96;
//		System.out.println(arr); // address of arr
//		for(int i : arr) {
//			System.out.println(i);
//		}
//	}
	
	
//// Syntax 2
//	public static void main(String[] args) {
//		int arr [] = {53,90,35};
//		System.out.println(arr);
//		for(int i:arr) {
//			System.out.println(i);
//		}
//	}
	

//// Default stored values
	// default value of 
//		int is 0
//		float is 0.0
//		boolean is false
//		string is ""
	
	public static void main(String[] args) {
		int arr[] = new int[3];
		for(int i:arr) {
			System.out.println(i); // 0 0 0 
		}
	}
	
}
