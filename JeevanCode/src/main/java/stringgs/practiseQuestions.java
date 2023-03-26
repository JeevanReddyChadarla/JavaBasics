package stringgs;

import java.util.Arrays;
import java.util.Scanner;

public class practiseQuestions {

	public practiseQuestions() {
		// TODO Auto-generated constructor stub
	}
//1.	Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.


//	public static int[] returnLengthOfEachElement(String strArr[]) {
//		int len[]=new int[strArr.length];
//		for(int i=0;i<strArr.length;i++) {
//			len[i]= strArr[i].length();
//		}
//		return len;
//	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size of the array: ");
//		int size=sc.nextInt();
//		String arrStr[]=new String[size];
//		for(int i=0;i<size;i++) {
//			arrStr[i]=sc.next();
//		}
//		System.out.println("The array u entered is : "+Arrays.toString(arrStr));
//		System.out.println("The length of each element is : "+Arrays.toString(returnLengthOfEachElement(arrStr)));
//	}
	
//2. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
	
//	public static String returnString(String orginal) {
//		char org[] = new char[orginal.length()];
//		String result = "";
//		for(int i=0;i<orginal.length();i++) {
//			org[i]=orginal.charAt(i);
//			result += org[i]=='e' ? 'i': org[i];
//		}
//		
//		return result;
//	}
//	public static void main(String[] args) {
//		System.out.println(returnString("eabcdef"));
//		System.out.println("xyz");
//	}
	
//3. Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//	Example : 
//		email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
//		email = “helloWorld123@gmail.com”; username = “helloWorld123”

	public static int returnlastIndex(String emailId) {
		int index = 0;
		char email[] = new char[emailId.length()];
		for(int i=0;i<email.length;i++) {
			email[i]=emailId.charAt(i);
		}
		for(int i=0;i<email.length;i++) {
			if(email[i]=='@') {
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		String emailIdOne = "apnaCollegeJava@gmail.com";
		String emailIdTwo = "helloWorld123@gmail.com";
		int lastIndexOne = returnlastIndex(emailIdOne);
		int lastIndexTwo = returnlastIndex(emailIdTwo);
		String userNameOne = emailIdOne.substring(0,lastIndexOne);
		String userNameTwo = emailIdTwo.substring(0,lastIndexTwo);
		System.out.println(userNameOne);
		System.out.println(userNameTwo);
	}
}
