/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. */
import java.util.Scanner;

public class StudentScorecard {

    // Method to calculate total, average, percentage
    public static double[] calculateResults(int physics, int chemistry, int maths) {
        double total = physics + chemistry + maths;
        double average = total / 3.0;
        double percentage = (total / 300.0) * 100; // out of 300 marks
        return new double[] { total, average, percentage };
    }

    // Method to determine grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display the scorecard
    public static void displayScorecard(int studentNumber, int physics, int chemistry, int maths, double total, double average, double percentage, String grade) {
        System.out.printf("Scorecard for Student %d%n", studentNumber);
        System.out.printf("Physics: %d%n", physics);
        System.out.printf("Chemistry: %d%n", chemistry);
        System.out.printf("Maths: %d%n", maths);
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.printf("Grade: %s%n", grade);
        System.out.println("-------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + i);
            System.out.print("Physics: ");
            int physics = scanner.nextInt();
            System.out.print("Chemistry: ");
            int chemistry = scanner.nextInt();
            System.out.print("Maths: ");
            int maths = scanner.nextInt();

            // Calculate results
            double[] results = calculateResults(physics, chemistry, maths);
            double total = results[0];
            double average = results[1];
            double percentage = results[2];

            // Calculate grade
            String grade = calculateGrade(percentage);
            
            // Display scorecard
            displayScorecard(i, physics, chemistry, maths, total, average, percentage, grade);
        }

        scanner.close();
    }
}
