import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Variable to store the result
        int result = 1;

        // Loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply the result with the number
        }

        // Output the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Close the scanner
        sc.close();
    }
}
