package stringgsbuffer;

public class practiseQuestions {

	public practiseQuestions() {
		// TODO Auto-generated constructor stub
	}
//// 1. Reverse a string - hello output should be - olleh
	
	public static String reverseString(String orgStr) {
		char orgStrArr [] = new char[orgStr.length()];
		char revStrArr [] = new char[orgStr.length()];
		for(int i=0;i<orgStr.length();i++) {
			orgStrArr[i]=orgStr.charAt(i);
			revStrArr[orgStr.length()-i-1]=orgStrArr[i];
		}
		String revString=new String(revStrArr);
		return revString;
	}
	
	public static StringBuilder returnReverseStrBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<sb.length()/2;i++) {
			int front = i;
			int back = sb.length()-1-i;
			char frontElem = sb.charAt(front);
			char backElem = sb.charAt(back);
			sb.setCharAt(front, backElem);
			sb.setCharAt(back, frontElem);
		}
		return sb;
	}
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
		StringBuffer name= new StringBuffer("hello");
		System.out.println(name.reverse());
		
		System.out.println(returnReverseStrBuilder("hello"));
	}
}
