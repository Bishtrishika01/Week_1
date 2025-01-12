/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.*/

import java.util.*;

class PossibleHanshakes{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Student : ");
		int n = sc.nextInt();
		
		int handshake = n*(n-1);
		handshake /= 2;
		
		System.out.println("Possible Handshake :"+ handshake);
	}
}