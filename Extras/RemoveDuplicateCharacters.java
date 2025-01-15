/*Write a Java program to remove all duplicate characters from a given string and return
the modified string.*/
import java.util.Scanner;

public class RemoveDuplicateCharacters {

    public static String removeDuplicates(String input) {
        StringBuilder modifiedString = new StringBuilder();

        // Loop through each character in the original string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // Check if the character is already in the modified string
            if (modifiedString.indexOf(String.valueOf(currentChar)) == -1) {
                modifiedString.append(currentChar); // Add to modified string if not present
            }
        }
        
        return modifiedString.toString(); // Convert StringBuilder back to String
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the removeDuplicates method and store the result
        String output = removeDuplicates(input);

        // Display the original and modified strings
        System.out.println("Original String: " + input);
        System.out.println("Modified String (Without Duplicates): " + output);
        
        // Close the scanner
        scanner.close();
    }
}
