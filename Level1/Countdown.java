import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the starting value of the countdown
        System.out.print("Enter a number for the countdown: ");
        int counter = scanner.nextInt();
        
        // Countdown using a while loop
        while (counter > 0) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }
        
        System.out.println("Lift off!"); // Final message after countdown
        scanner.close(); // Closing the scanner
    }
}
