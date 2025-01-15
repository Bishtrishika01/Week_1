/*Write a Java program that accepts two strings from the user and checks if the two
strings are anagrams of each other (i.e., whether they contain the same characters in any
order).*/
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user for the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Remove whitespace and convert both strings to lowercase
        String cleanedFirstString = firstString.replaceAll("\\s+", "").toLowerCase();
        String cleanedSecondString = secondString.replaceAll("\\s+", "").toLowerCase();

        // Convert strings to character arrays and sort them
        char[] firstArray = cleanedFirstString.toCharArray();
        char[] secondArray = cleanedSecondString.toCharArray();
        
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        // Check if sorted arrays are equal
        boolean areAnagrams = Arrays.equals(firstArray, secondArray);

        // Display the result
        if (areAnagrams) {
            System.out.println("The two strings are anagrams of each other.");
        } else {
            System.out.println("The two strings are not anagrams of each other.");
        }

        // Close the scanner
        scanner.close();
    }
}
