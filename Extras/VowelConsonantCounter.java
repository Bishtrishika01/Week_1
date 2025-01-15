/*Write a Java program to count the number of vowels and consonants in a given string.*/
import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowelCount = 0;
        int consonantCount = 0;

        
        String lowerCaseInput = input.toLowerCase();

        
        for (char ch : lowerCaseInput.toCharArray()) {
            
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        // Close the scanner
        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
