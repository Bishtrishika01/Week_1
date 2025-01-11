import java.util.Scanner;

public class SumOfNaturalNumber {
    // Function to check if a number is a natural number
    public static boolean isNaturalNumber(double n) {
        return n > 0 && n == (int) n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            double userInput = scanner.nextDouble();

            if (isNaturalNumber(userInput)) {
                int n = (int) userInput;

                // Compute using the formula
                int formulaResult = (n * (n + 1)) / 2;

                // Compute using a for loop
                int loopResult = 0;
                for (int i = 1; i <= n; i++) {
                    loopResult += i;
                }

                // Compare results and print
                if (formulaResult == loopResult) {
                    System.out.println("Both methods resulted in the same sum: " + formulaResult);
                } else {
                    System.out.println("There is an error in the computations.");
                }
            } else {
                System.out.println("The number is not a natural number.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
