/*Write a program to find the frequency of characters in a string using nested loops and display the result
Hint => 
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
Loops to Find the frequency of each character in the text and store the result in an frequency array. For this use Nested Loop with Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
Create an 1D String array to store the characters and their frequencies. For this Iterate through the characters in the text and store the characters and their frequencies 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/
import java.util.Scanner;

public class FrequencyWithNestedLoops {

    // Method to find the frequency of characters
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray(); // Convert text to character array
        int[] frequency = new int[chars.length]; // Frequency array
        int n = chars.length;

        // Outer loop to calculate frequency for each character
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') {
                continue; // Skip already counted characters
            }
            frequency[i] = 1; // Initialize frequency to 1
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++; // Increment frequency
                    chars[j] = '0'; // Mark duplicate character
                }
            }
        }

        // Create an array to store the result
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }
        String[] result = new String[uniqueCount];
        int index = 0;

        // Store unique characters and their frequencies
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " - " + frequency[i];
            }
        }

        return result;
    }

    // Method to display the frequency
    public static void displayFrequencies(String[] frequencies) {
        System.out.println("Character - Frequency");
        
        for (String entry : frequencies) {
            System.out.println(entry);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Find and display character frequencies
        String[] frequencies = findCharacterFrequency(userInput);
        displayFrequencies(frequencies);

        scanner.close();
    }
}
