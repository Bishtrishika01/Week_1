import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a natural number: ");

        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            // Check if the number is a natural number (positive integer)
            if (number < 1) {
                System.out.println("Please enter a natural number (1 or greater).");
            } else {
                // Iterate from 1 to the entered number
                for (int i = 1; i <= number; i++) {
                    // Check if the number is odd or even
                    if (i % 2 == 0) {
                        System.out.println(i + " is an even number.");
                    } else {
                        System.out.println(i + " is an odd number.");
                    }
                }
            }
        } else {
            System.out.println("Invalid input. Please enter a valid natural number.");
        }

        scanner.close();
    }
}
