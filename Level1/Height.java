/* Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___ */
import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();
        
        
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;

        
        double totalInches = heightCm / cmPerInch;

        
        int feet = (int)(totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;

        
        System.out.printf("Your Height in cm is "+heightCm+" while in feet is "+feet+" and inches is "+inches); 
                
    }
}
