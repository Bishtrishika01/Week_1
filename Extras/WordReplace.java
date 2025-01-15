/*Write a replace method in Java that replaces a given word with another word in a
sentence:*/
import java.util.Scanner;

public class WordReplace {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Prompt the user for the word to replace
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();
        
        // Prompt the user for the new word
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();
        
        // Replace the word in the sentence
        String modifiedSentence = sentence.replace(wordToReplace, newWord);
        
        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
        
        // Close the scanner
        scanner.close();
    }
}
