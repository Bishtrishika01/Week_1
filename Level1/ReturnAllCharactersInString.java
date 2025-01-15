/*Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result*/

import java.util.*;

class ReturnAllCharactersInString{
	public static char[] stringToCharArray(String str){
		char[] charArray = new char[str.length()];
		for(int i=0;i<charArray.length;i++){
			charArray[i] = str.charAt(i);
		}
		return charArray;
	}
	public static boolean compareTwoCharArray(char[] arr1,char[] arr2){
		if(arr1.length != arr2.length){
			return false;
		}
		for(int i=0;i<arr1.length;i++){
			if (arr1[i]==arr2[i]){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
				
		char[] arr1 = stringToCharArray(str);
		
        char[] arr2 = str.toCharArray();
		
		
        System.out.println("Result : "+compareTwoCharArray(arr1,arr2));
	} 
}