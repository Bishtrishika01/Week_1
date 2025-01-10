import java.util.Scanner;

public class ChocolateDistributor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of chocolates from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Get the number of children from the user
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate the number of chocolates per child and remaining chocolates
        if (numberOfChildren > 0) {
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            // Display the results
            System.out.println("Each child gets: " + chocolatesPerChild + " chocolates.");
            System.out.println("Remaining chocolates: " + remainingChocolates);
        } else {
            System.out.println("Number of children must be greater than zero.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
