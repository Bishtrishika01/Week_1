import java.util.Scanner;

public class BMIStatus {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take user input for weight in kg and height in cm
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightInCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeters * heightInMeters);

        // Print BMI
        System.out.printf("Your BMI is: "+ bmi);

        // Determine weight status
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        // Close the scanner
        sc.close();
    }
}

