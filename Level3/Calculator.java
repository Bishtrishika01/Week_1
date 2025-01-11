import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Declare the variables
        double first, second, result;
        String op;

        // Get the user input for the two numbers and the operator
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();

        // Use switch...case to perform the correct operation based on the operator
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + first + " * " + second + " = " + result);
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                // If the operator is not recognized, print an error message
                System.out.println("Invalid operator! Please use one of the following: +, -, *, /");
                break;
        }

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}