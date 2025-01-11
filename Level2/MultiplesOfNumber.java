import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // display the multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");

        // Loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of number
            if (number%i == 0) {
                System.out.println(i);
            }
        }

    }
}