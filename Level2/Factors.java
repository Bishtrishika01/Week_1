
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Print the factors of the number
        System.out.println("Factors of " + number + " are:");

        // Loop through all numbers from 1 to number
        for (int i = 1; i <= number; i++) {
            // If number is divisible by i, it's a factor
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Close the scanner
        sc.close();
    }
}

