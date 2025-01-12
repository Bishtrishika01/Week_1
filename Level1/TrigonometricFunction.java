/*Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)*/
import java.util.*;

public class TrigonometricFunction {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Angle in degree : ");
        double angleInDegrees = sc.nextDouble(); 
        double[] results = calculateTrigonometricFunctions(angleInDegrees);
        
        System.out.println("For an angle of " + angleInDegrees + " degrees:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent in radians
        double sine = Math.sin(radians);     // sin(radians)
        double cosine = Math.cos(radians);   // cos(radians)
        double tangent = Math.tan(radians);  // tan(radians)

        // Return the results in an array
        return new double[] { sine, cosine, tangent };
    }
}
