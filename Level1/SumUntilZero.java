import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers to sum (enter 0 to finish):");
        
        int total = 0;  // Initialize total to 0
        int input=sc.nextInt();        // Variable to store user input

        
        while (input != 0) {
			if (input == 0) {
                break; // Exit the loop if the user enters 0
            }
            
            total += input; // Add the input value to total
        }
        
        // Display the total value outside of the loop
        System.out.printf("The total sum is: %.2f%n", total);
        
    }
}
