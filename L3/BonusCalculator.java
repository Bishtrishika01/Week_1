/*Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
*/
import java.util.Random;

public class BonusCalculator {
    
    final int NUM_EMPLOYEES = 10;
    Random random = new Random();

    // Method to determine the salary and years of service
    public double[][] getEmployeesData() {
        double[][] employees = new double[NUM_EMPLOYEES][2];
        
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double salary = 10000 + (random.nextInt(90000)); // Random salary between 10,000 and 100,000
            int yearsOfService = random.nextInt(21); // Random years of service between 0 and 20
            
            employees[i][0] = salary;                 // Salary
            employees[i][1] = yearsOfService;         // Years of service
        }
        return employees;
    }

    // Method to calculate new salary and bonus
    public double[][] calculateNewSalaryAndBonus(double[][] employees) {
        double[][] result = new double[NUM_EMPLOYEES][3];
        
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double oldSalary = employees[i][0];
            int yearsOfService = (int) employees[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02; // Determine bonus percentage
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;
            
            result[i][0] = oldSalary; // Old Salary
            result[i][1] = newSalary; // New Salary
            result[i][2] = bonus;     // Bonus
        }
        return result;
    }

    // Method to calculate the sum of Old Salary, New Salary, and Total Bonus
    public void calculateSums(double[][] results) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            sumOldSalary += results[i][0];
            sumNewSalary += results[i][1];
            totalBonus += results[i][2];
        }

        // Display the results in tabular format
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s\n", "Old Salary", "New Salary", "Bonus");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("%-15.2f %-15.2f %-15.2f\n", results[i][0], results[i][1], results[i][2]);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", sumOldSalary);
        System.out.printf("Total New Salary: %.2f\n", sumNewSalary);
        System.out.printf("Total Bonus Amount: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        BonusCalculator calculator = new BonusCalculator();
        
        // Get employee data
        double[][] employees = calculator.getEmployeesData();
        
        // Calculate new salaries and bonuses
        double[][] results = calculator.calculateNewSalaryAndBonus(employees);
        
        // Calculate sums and display results
        calculator.calculateSums(results);
    }
}
