/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a method to define the random 2 digit age of number of students provided as method parameters and return 1D array of age of n students
Create a method which takes in array of age as a parameter and returns 2D String array of age and boolean true or false to indicate can vote and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to settrue to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.*/
import java.util.Scanner;

public class VotingEligibility {

    // Method to input ages of students
    public static int[] inputAges(int numberOfStudents) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote"; // Negative age
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote"; // Can vote
            } else {
                result[i][1] = "Cannot Vote"; // Cannot vote
            }
        }
        return result;
    }

    // Method to display the results
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-15s%n", "Age", "Eligibility");
        System.out.println("---------------------");
        for (String[] result : results) {
            System.out.printf("%-10s %-15s%n", result[0], result[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students (up to 10): ");
        int numberOfStudents = scanner.nextInt();

        // Validate the input
        if (numberOfStudents < 1 || numberOfStudents > 10) {
            System.out.println("Please enter a number between 1 and 10.");
            return;
        }

        // Input ages
        int[] ages = inputAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibilityResults = checkVotingEligibility(ages);

        // Display results
        displayResults(eligibilityResults);
        
        scanner.close();
    }
}
