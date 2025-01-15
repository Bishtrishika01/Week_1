/*Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result*/
import java.util.Scanner;

public class TrimString {

    // Method to trim leading and trailing spaces
    public static int[] findTrimPoints(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with leading and trailing spaces:");
        String input = scanner.nextLine();

        // Find trim points
        int[] trimPoints = findTrimPoints(input);

        // Create substring after trimming
        String trimmedUsingMethod = createSubstring(input, trimPoints[0], trimPoints[1]);

        // Use built-in trim method
        String trimmedUsingBuiltIn = input.trim();

        // Compare the two strings
        boolean areEqual = compareStrings(trimmedUsingMethod, trimmedUsingBuiltIn);

        // Display results
        System.out.println("Trimmed using method: '" + trimmedUsingMethod + "'");
        System.out.println("Trimmed using built-in: '" + trimmedUsingBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        scanner.close();
    }
}
