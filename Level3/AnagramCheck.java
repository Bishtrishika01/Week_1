/*Write a program to check if two texts are anagrams and display the result
Hint => 
Anagram is a word or phrase formed by rearranging the same letters to form different words or phrase,
Write a method to check if two texts are anagrams. The logic used here is as follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
In the main function take user inputs, call user-defined methods, and displays result.
*/
import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Create frequency arrays
        int[] frequency1 = new int[256]; // For text1
        int[] frequency2 = new int[256]; // For text2

        // Step 3: Calculate the frequency of characters in text1
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
        }

        // Step 4: Calculate the frequency of characters in text2
        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++;
        }

        // Step 5: Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true; // If all frequencies match, the texts are anagrams
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine().replaceAll("[\\s+]", "").toLowerCase();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine().replaceAll("[\\s+]", "").toLowerCase();

        // Check if the two texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
