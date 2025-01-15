/*Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result*/
import java.util.*;

class CompareTwoString{
	public static boolean compareTwo(String str1 ,String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		for(int i=0;i<=str1.length();i++){
			if(str1.charAt(i)==str2.charAt(i)){
				return true;
			}
		}
		return false;
	}	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String : ");
		String str2 = sc.nextLine();
		boolean checkEqual = str1.equals(str2);
		System.out.println("Compare using charAt() : "+ compareTwo(str1,str2));
		if (compareTwo(str1,str2)){
			System.out.println("Result are same");
	    }
		else{
			System.out.println("Result are different");
		}
	}
}	