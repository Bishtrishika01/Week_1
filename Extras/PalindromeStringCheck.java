/*Write a Java program to check if a given string is a palindrome (a string that reads the
same forward and backward).*/
import java.util.*;

class PalindromeStringCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		
		for(int i=0;i<sb.length()/2;i++){
			int first = i;
			int last = sb.length()-i-1;
		    char firstChar = sb.charAt(first);
			char lastChar = sb.charAt(last);
			sb.setCharAt(first,lastChar);
			sb.setCharAt(last,firstChar);
		}
		boolean isEqual = str.equals(sb);
		System.out.println("Is string is Palindrome : "+isEqual);
	}
}