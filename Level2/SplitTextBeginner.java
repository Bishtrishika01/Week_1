/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result.*/
import java.util.Scanner;

public class SplitTextBeginner {

    // Method to split the text into words without using split()
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

        // Split the text into words
        String[] words = splitText(input);

        // Find the shortest and longest words
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // Display results
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\nShortest Word: " + shortest);
        System.out.println("Longest Word: " + longest);

        scanner.close();
    }
}