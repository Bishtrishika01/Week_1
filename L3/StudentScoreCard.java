/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and the percentage score 

Hint => 
Take input for the number of students
Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using the Math.round() method. 
Finally, write a Method to display the scorecard of all students with their scores, total, average, and percentage in a tabular format using "\t". 
*/
import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 10 + random.nextInt(91); // Physics score (10 to 100)
            scores[i][1] = 10 + random.nextInt(91); // Chemistry score (10 to 100)
            scores[i][2] = 10 + random.nextInt(91); // Math score (10 to 100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][4];

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Total score
            double average = total / 3.0; // Average score
            double percentage = (total / 300.0) * 100; // Percentage score
            
            // Round to 2 decimal places
            results[i][0] = total; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage
            // Store scores for display
            results[i][3] = i; // Store index for reference
        }
        return results;
    }
    
    // Method to display the scorecard of all students
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        System.out.println("--------------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f%n", 
                              (i + 1), 
                              scores[i][0], 
                              scores[i][1], 
                              scores[i][2], 
                              results[i][0], 
                              results[i][1], 
                              results[i][2]);
        }
        System.out.println("--------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random scores for the students
        int[][] scores = generateRandomScores(numberOfStudents);
        
        // Calculate results (total, average, percentage)
        double[][] results = calculateResults(scores);
        
        // Display the scorecard
        displayScoreCard(scores, results);

        scanner.close();
    }
}
