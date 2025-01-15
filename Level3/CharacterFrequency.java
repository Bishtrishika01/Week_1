/*Write a program to find the frequency of characters in a string using charAt() method and display the result
Hint => 
Create a method to find the frequency of characters in a string using charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result. */
import java.util.Scanner;

public class CharacterFrequency {
    
    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Frequency array for ASCII characters

        // Calculate frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Count unique characters for sizing the result array
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Store characters and their frequencies in a 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Store character
                result[index][1] = Integer.toString(frequency[i]); // Store frequency
                index++;
            }
        }

        return result; // Return the result array
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
