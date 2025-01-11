import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store the original number for later use if needed
        int originalNumber = number;

        // Initialize a variable count to 0
        int count = 0;

        // Check if the number is 0 (0 has 1 digit)
        if (number == 0) {
            count = 1;
        } else {
            // Loop until the number is reduced to 0
            while (number != 0) {
                // Remove the last digit by dividing by 10
                number /= 10;

                // Increase the digit count
                count++;
            }
        }

        // Display the result
        System.out.println("The number " + originalNumber + " has " + count + " digits.");

        // Close the scanner
        input.close();
    }
}