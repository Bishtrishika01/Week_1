import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take year as input from the user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Part 1: Multiple if-else statements to check for leap year
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
        }

        // Part 2: Single if statement with logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner
        sc.close();
    }
}

