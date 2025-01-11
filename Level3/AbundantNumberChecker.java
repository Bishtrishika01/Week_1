import java.util.Scanner;

public class AbundantNumberChecker {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

       
        int sumOfDivisors = 0;

        // Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Check if number is divisible by i
            if (number % i == 0) {
                // Add i to sum if it is a divisor
                sumOfDivisors += i;
            }
        }

        // Check if sum is greater than number
        if (sumOfDivisors > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

    }
}
