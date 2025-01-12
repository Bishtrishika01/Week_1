/*Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop*/
import java.util.*;

class SumNaturalNumber{
	public int calculateSum(int n){
		int sum = 0;
		if(n>=0){
			for(int i=0; i<=n ; i++){
			sum+=i;
			}
			return sum;
		}
		else{
			System.out.println("Invalid Number");
			return 0;
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		SumNaturalNumber natural = new SumNaturalNumber();
		int sum = natural.calculateSum(n);
		
		System.out.println("The sum of "+n+" natural number are : "+ sum);
	}
}