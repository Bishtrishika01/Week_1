/*Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result*/
import java.util.*;

class CompareSubstring{
	public static boolean compareSubstrings(String str1, String str2, int startIndex, int endIndex){
		String subStr1 = str1.substring(startIndex,endIndex);
		String subStr2 = str1.substring(startIndex,endIndex);
		if (subStr1.length() != subStr2.length()){
			return false;
		}
		if(subStr1.length() != subStr2.length()){
			return false;
		}
		for(int i=0;i<=subStr1.length();i++){
			if(subStr1.charAt(i) == subStr2.charAt(i)){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String : ");
		String str1 = sc.next();
		System.out.println("Enter second String : ");
		String str2 = sc.next();
		System.out.println("Enter Starting Index : ");
		int startIndex = sc.nextInt();
		System.out.println("Enter Ending Index : ");
		int endIndex = sc.nextInt();
	
		System.out.println("Are Subsstring are same : "+compareSubstrings(str1,str2,startIndex,endIndex));
	}
}