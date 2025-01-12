/*Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor)*/
import java.util.Scanner;

public class RemainderAndQuotient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        
        // Handle division by zero
        if (divisor == 0) {
            System.out.println("The divisor cannot be zero.");
            return;
        }

        // Get the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);
        
        // Print the results
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
        
        scanner.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;       // Calculate quotient
        int remainder = number % divisor;      // Calculate remainder
        
        // Return results in an array
        return new int[] { quotient, remainder };
    }
}
