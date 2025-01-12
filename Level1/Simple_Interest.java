/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”*/
import java.util.*;

class Simple_Interest{
	
	public double calculateSimpleInterst(double principal, double rate, double time){
		doub4000le simpleInterest = principal * rate * time;
		simpleInterest /= 100;
		return simpleInterest;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		
		Simple_Interest obj = new Simple_Interest();
		double simpleInterest = obj.calculateSimpleInterst(principal,rate,time);
		
		System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+ principal+", Rate of Interest "+rate+ " and time "+time);
		
	}
}