/*Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers*/
import java.util.*;

class SmallestAndLargestofThreeNumber{
	public static int findSmallestAndLargest(int number1, int number2, int number3){
		int smallest = number1;
		int largest = number1;
		
		if(number2<smallest){
			smallest = number1;
		}
		if(number3<smallest){
			smallest = number3;
		}
		if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        System.out.println(smallest + " is the smallest");
        System.out.println(largest + " is the largest");
		
		return 0;
    }
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int number1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		int number2 = sc.nextInt();
		System.out.println("Enter Third number : ");
		int number3 = sc.nextInt();
		
		SmallestAndLargestofThreeNumber obj = new SmallestAndLargestofThreeNumber();
		obj.findSmallestAndLargest(number1,number2,number3);
	}
}