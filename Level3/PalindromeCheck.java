/*Write a program to to check if a text is palindrome and display the result
Hint => 
Palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and the end index
Logic 3: Write a Method to compare the characters from the start and end of the text using  character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using charAt() method and return the reversal array.
Create a character array using String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do Palindrome check 
Finally in the main method do palindrom check using the three logic and display
*/
import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative comparison of characters
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Logic 2: Recursive comparison of characters
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Helper method for Logic 3: Reverse the string
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    // Logic 3: Comparison using reversed string and toCharArray()
    public static boolean isPalindromeUsingReverse(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text).toCharArray();

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text to check if it is a palindrome: ");
        String userInput = scanner.nextLine();

        // Normalize the text by removing spaces and converting to lowercase
        String normalizedText = userInput.replaceAll("[\\s+]", "").toLowerCase();

        // Logic 1
        boolean isIterative = isPalindromeIterative(normalizedText);
        System.out.println("Is Palindrome (Iterative Logic)? " + isIterative);

        // Logic 2
        boolean isRecursive = isPalindromeRecursive(normalizedText, 0, normalizedText.length() - 1);
        System.out.println("Is Palindrome (Recursive Logic)? " + isRecursive);

        // Logic 3
        boolean isUsingReverse = isPalindromeUsingReverse(normalizedText);
        System.out.println("Is Palindrome (Using Reverse Logic)? " + isUsingReverse);

        scanner.close();
    }
}
