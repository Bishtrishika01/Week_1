import java.util.*;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a natural number
        if (number >= 1) { // Natural numbers are positive integers (1, 2, 3, ...)
            int sum = number * (number + 1) / 2; // Calculate the sum of first n natural numbers
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
        
    }
}
