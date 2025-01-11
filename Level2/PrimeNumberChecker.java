import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // create a variable to determine whether number is prime or not
        boolean isPrime = true;  // Assume the number is prime

        // Check if the number is prime
        if (number <= 1) {
            isPrime = false;  
        } else {
            // Loop through numbers from 2 to number-1
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // To Check if the number is divisible by i
                if (number % i == 0) {
                    isPrime = false;  // If divisible, it's not prime
                    break;  
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Close the scanner
        sc.close();
    }
}

