/*Write a program calculate the wind chill temperature given the temperature and wind speed
Hint => 
Write a method to calculate the wind chill temperature using the formula 
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
public double calculateWindChill(double temperature, double windSpeed)*/
import java.util.*;

class WindChillTemprature{
	public double calculateWindChill(double temp, double windSpeed){
		double windChill =  35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed,0.16);
		System.out.println("Wind chill temprature of temprature "+temp+" and Wind Speed "+windSpeed+ " is : "+windChill);
		return windChill;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temprature : ");
		double temp = sc.nextDouble();
		System.out.println("Enter Wind Speed : ");
		double windSpeed = sc.nextDouble();
		
		WindChillTemprature wind =new WindChillTemprature();
		wind.calculateWindChill(temp,windSpeed);
	}
}