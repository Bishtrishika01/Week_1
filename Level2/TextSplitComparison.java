/*Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result*/
import java.util.Scanner;

public class TextSplitComparison {

    // Method to split text into words without using split()
    public static String[] splitText(String text) {
        String word = "";
        int spaceCount = 0;

        // Count spaces to determine the number of words
        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int index = 0;

        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += ch;
            }
        }

        words[index] = word; // Add the last word
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Custom split
        String[] customSplit = splitText(input);

        // Display custom split result
        System.out.println("Words in the sentence:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        scanner.close();
    }
}
