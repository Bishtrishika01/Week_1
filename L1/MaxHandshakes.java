/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes*/
import java.util.*;

class MaxHanshakes{
	public int Handshake(int n){
		int handshake = n*(n-1);
		handshake /= 2;
		return handshake;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Student : ");
		int n = sc.nextInt();
		
		MaxHanshakes student = new MaxHanshakes();
		int handshake = student.Handshake(n);
		
		System.out.println("Maximum Handshake :"+ handshake);
	}
}