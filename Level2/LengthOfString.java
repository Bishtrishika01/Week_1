/*Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result*/
import java.util.*;

class LengthOfString{
	
    public static int customLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Try to access the character at the current count
                count++; // Increment the count if the character is accessed successfully
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Caught the exception when count goes out of bounds
            // Return the count which is the length of the string
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Using the custom length method
        int customLengthResult = customLength(userInput);
        
        // Using the built-in length() method
        int builtInLengthResult = userInput.length();
        
        // Displaying the results
        System.out.println("Length of the string using custom method: " + customLengthResult);
        System.out.println("Length of the string using built-in method: " + builtInLengthResult);

    }
}