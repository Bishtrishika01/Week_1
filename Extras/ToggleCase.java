/*Write a Java program to toggle the case of each character in a given string. Convert
uppercase letters to lowercase and vice versa.*/
import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Variable to store the toggled result
        String toggledString = "";
        
        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);  // Get the current character
            
            // Toggle the case
            if (currentChar >= 'A' && currentChar <= 'Z') {
                toggledString += (char)(currentChar + 32); // Convert to lowercase
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                toggledString += (char)(currentChar - 32); // Convert to uppercase
            } else {
                toggledString += currentChar; // Keep non-alphabetic characters unchanged
            }
        }
        
        // Output the result
        System.out.println("Toggled case string: " + toggledString);
        
        // Close the scanner
        scanner.close();
    }
}
