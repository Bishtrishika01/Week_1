import java.util.Scanner;

public class Is_A_LeapYear {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take year as input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Single if statement with logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner
        sc.close();
    }
}

