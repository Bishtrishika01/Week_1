/*Write a Java program that takes a sentence as input and returns the longest word in the
sentence.*/
import java.util.Scanner;

public class LongestWordFinder {

    public static String findLongestWord(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.split(" ");
        String longestWord = "";

        // Iterate through the words to find the longest one
        for (String word : words) {
            // Check if the current word is longer than the previously found longest word
            if (word.length() > longestWord.length()) {
                longestWord = word;  // Update the longest word
            }
        }
        
        return longestWord; // Return the longest word found
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Find the longest word in the sentence
        String longestWord = findLongestWord(sentence);
        
        // Output the longest word
        System.out.println("The longest word is: " + longestWord);
        
        // Close the scanner
        scanner.close();
    }
}
