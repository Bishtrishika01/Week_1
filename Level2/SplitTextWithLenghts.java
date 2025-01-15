/*Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display*/
import java.util.Scanner;

class SplitTextWithLengths {

    // Method to find the length of a string without using length()
    public static int getStringLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

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

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(getStringLength(words[i]));
        }

        return wordLengths;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Split the text into words
        String[] words = splitText(input);

        // Get words with their lengths
        String[][] wordLengths = getWordsWithLengths(words);

        // Display results in tabular format
        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }

        scanner.close();
    }
}
