/*Write a Java program to reverse a given string without using any built-in reverse
functions.*/
import java.util.Scanner;

class ReverseString{
	public static void main(String args[]){
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
		System.out.println("Reverse of "+str+" is "+sb);
	}
}