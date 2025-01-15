/*Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using charAt() method and return them as 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.*/
import java.util.Scanner;

public class CharacterFrequencyUnique {
    
    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the unique list
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Trim the array to only include unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);

        return result;
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text); // Get unique characters
        int[] frequency = new int[uniqueChars.length]; // Frequency array for unique characters

        // Count frequency of each unique character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            for (int j = 0; j < uniqueChars.length; j++) {
                if (uniqueChars[j] == currentChar) {
                    frequency[j]++;
                    break;
                }
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(frequency[i]);
        }

        return result;
    }

    // Method to display the result in a tabular format
    public static void displayFrequencies(String[][] frequencies) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        
        for (String[] row : frequencies) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Finding the frequency of characters
        String[][] frequencies = findCharacterFrequency(userInput);

        // Displaying the result
        displayFrequencies(frequencies);

        scanner.close();
    }
}
