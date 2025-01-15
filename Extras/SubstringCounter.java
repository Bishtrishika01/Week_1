/*Write a Java program to count how many times a given substring occurs in a string.*/
import java.util.Scanner;

public class SubstringCounter {

    public static int countSubstringOccurrences(String str, String substring) {
        int count = 0; // Initialize count of occurrences
        int index = 0; // Start searching from the beginning of the string
        
        // Use indexOf to find occurrences of the substring
        while ((index = str.indexOf(substring, index)) != -1) {
            count++; // Increment count for each occurrence found
            index++; // Move to the next character after the found substring
        }
        
        return count; // Return the total count found
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        // Prompt the user for the substring to be counted
        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();
        
        // Count occurrences of the substring in the main string
        int occurrences = countSubstringOccurrences(mainString, substring);
        
        // Output the result
        System.out.println("The substring \"" + substring + "\" occurs " + occurrences + " times in the main string.");
        
        // Close the scanner
        scanner.close();
    }
}
