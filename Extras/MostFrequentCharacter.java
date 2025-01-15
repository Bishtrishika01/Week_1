/*Write a Java program to find the most frequent character in a string.
Example Input:
String: "success"*/
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Find and display the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(input);
        
        if (mostFrequentChar != 0) {
            System.out.println("The most frequent character is: '" + mostFrequentChar + "'");
        } else {
            System.out.println("The string is empty.");
        }
        
        // Close the scanner
        scanner.close();
    }

    public static char findMostFrequentCharacter(String str) {
        // Variable to store the most frequent character
        char mostFrequent = '\0';
        int highestCount = 0;

        // Compare each character in the string with every other character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            // Count how many times currentChar appears in the string
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Update most frequent character if current character count is higher
            if (count > highestCount) {
                highestCount = count;
                mostFrequent = currentChar;
            }
        }

        return mostFrequent; // Return the most frequent character
    }
}
