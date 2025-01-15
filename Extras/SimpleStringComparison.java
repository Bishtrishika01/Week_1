/*Write a Java program to compare two strings lexicographically (dictionary order) without
using built-in compare methods.
Example Input:
String 1: "apple"
String 2: "banana"*/
import java.util.Scanner;

public class SimpleStringComparison {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the first string
        System.out.print("Enter String 1: ");
        String string1 = scanner.nextLine();
        
        // Prompt the user for the second string
        System.out.print("Enter String 2: ");
        String string2 = scanner.nextLine();
        
        // Compare the two strings using the custom compare function
        int result = compareStrings(string1, string2);
        
        // Output the comparison result
        if (result < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\".");
        } else if (result > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\".");
        } else {
            System.out.println("Both strings are equal.");
        }
        
        // Close the scanner
        scanner.close();
    }

    // Custom method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        // Loop through each character of the strings
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);
            
            // Compare characters
            if (char1 < char2) {
                return -1; // str1 is less than str2
            } else if (char1 > char2) {
                return 1; // str1 is greater than str2
            }
        }
        
        // If all characters are equal till the length of the shorter string,
        // check the lengths.
        if (str1.length() < str2.length()) {
            return -1; // str1 is shorter
        } else if (str1.length() > str2.length()) {
            return 1; // str1 is longer
        }
        
        return 0; // Both strings are equal
    }
}

