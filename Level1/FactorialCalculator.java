import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer to calculate its factorial: ");
        
        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            // Check if the number is positive
            if (number < 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                long factorial = 1; // Use long to handle larger factorials
                int i = 1;

                // Compute factorial using a while loop
                while (i <= number) {
                    factorial *= i;
                    i++;
                }

                // Print the result
                System.out.println("The factorial of " + number + " is " + factorial + ".");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid positive integer.");
        }
        
        scanner.close();
    }
}
