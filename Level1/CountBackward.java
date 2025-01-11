import java.util.Scanner;

public class CountBackward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number for the countdown: ");
        int counter = scanner.nextInt();
        
        // Countdown using a for loop
        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }
        
        System.out.println("Lift off!"); // Final message after countdown
        scanner.close(); // Closing the scanner
    }
}
