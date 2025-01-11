import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Ensure the input number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 1 to the number
            for (int i = 1; i <= number; i++) {
                // To Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                //  to Check divisiblity by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // To Check divisiblity by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if it's neither divisible by 3 nor 5
                else {
                    System.out.println(i);
                }
            }
        }

        // Close the scanner
        sc.close();
    }
}

