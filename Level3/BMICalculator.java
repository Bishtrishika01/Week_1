/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameter. Calls the  user defined method to compute the BMI and the BMI Status and store in 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person Height, Weight, BMI and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.*/
import java.util.Scanner;

public class BMICalculator {
    
    // Method to compute BMI and Status
    public static String[][] computeBMIAndStatus(double[][] personData) {
        String[][] result = new String[10][4];
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInCm = personData[i][1];
            double heightInMeters = heightInCm / 100; // Convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters); // Calculate BMI
            
            String status;
            if (bmi < 18.4) {
                status = "Underweight";
            } else if (bmi >= 18.4 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 24 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }
            
            // Store results
            result[i][0] = String.format("%.2f", heightInCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }
    
    // Method to display the result array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
       
        for (String[] person : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", person[0], person[1], person[2], person[3]);
        }
    }
    
    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2];
        
        // Taking inputs for height and weight
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter weight (kg) for person %d: ", i + 1);
            personData[i][0] = scanner.nextDouble();
            
            System.out.printf("Enter height (cm) for person %d: ", i + 1);
            personData[i][1] = scanner.nextDouble();
        }
        
        // Compute BMI and status
        String[][] bmiResults = computeBMIAndStatus(personData);
        
        // Display results
        displayResults(bmiResults);
        
        scanner.close();
    }
}
