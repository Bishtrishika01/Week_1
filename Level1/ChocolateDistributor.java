/*Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/
import java.util.Scanner;

public class ChocolateDistributor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Handle case where there are no children
        if (numberOfChildren == 0) {
            System.out.println("The number of children cannot be zero.");
            return;
        }

        // Call the method to find the quotient and remainder
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        
        // Print the results
        System.out.println("Each child will get: " + result[0] + " chocolate(s)");
        System.out.println("Remaining chocolates: " + result[1]);

        scanner.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int chocolatesPerChild = number / divisor;   // Calculate chocolates per child (quotient)
        int remainingChocolates = number % divisor;  // Calculate remaining chocolates (remainder)
        
        // Return results in an array
        return new int[] { chocolatesPerChild, remainingChocolates };
    }
}
