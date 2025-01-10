/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/
import java.util.*;

class AreaOfTriangle{
	
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base of triangle: ");
		int base = sc.nextInt();
		System.out.println("Enter height of triangle: ");
		int height = sc.nextInt();
		double area = 0.5 * base * height;
		System.out.println("Area of Triangle : "+area);
	}
	
}