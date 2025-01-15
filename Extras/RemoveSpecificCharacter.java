/*Write a Java program to remove all occurrences of a specific character from a string.
Example Input:
String: "Hello World"
Character to Remove: 'l'

Expected Output:
Modified String: "Heo Word"*/
import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Prompt the user for the character to remove
        System.out.print("Enter character to remove: ");
        char charToRemove = scanner.next().charAt(0);
        
        // StringBuilder to hold the modified string
        StringBuilder modifiedString = new StringBuilder();
        
        // Iterate over each character in the input string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            
            // Append to modifiedString if the current character is not the one to remove
            if (currentChar != charToRemove) {
                modifiedString.append(currentChar);
            }
        }
        
        // Display the modified string
        System.out.println("Modified String: " + modifiedString.toString());

        // Close the scanner
        scanner.close();
    }
}
