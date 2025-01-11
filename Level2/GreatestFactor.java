
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Variable to store the greatest factor
        int greatestFactor = 1;

        // Loop to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Output the result
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        // Close the scanner
        sc.close();
    }
}

