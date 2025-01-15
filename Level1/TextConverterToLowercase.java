/*Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
Write a program to split the text into words and return the words along with their lengths in a 2D array*/
import java.util.*;

class TextConverterToLowercase{
	public static String convertToLowerCase(String input){
		StringBuilder result = new StringBuilder("");
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			if(ch>='A' && ch<='Z'){
				result.append((char)(ch+32));
			}else
			result.append(ch);
		}
		return result.toString();
	}
	public static boolean compareTwoString(String str1, String str2){
		return str1.equals(str2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String str1 = input.toLowerCase();
		String str2 = convertToLowerCase(input);
		System.out.println("Lowercase using toLowerCase method : "+str1);
		System.out.println("Lowercase without using toLowerCase method : "+str2);
		System.out.println("Is both string are same : "+compareTwoString(str1,str2));
		
		
	}
}