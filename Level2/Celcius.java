import java.util.*;

class Celcius{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit : ");
		double fahrenheit = sc.nextDouble();
		
		double celcius = (fahrenheit-32) * 5/9;
		System.out.println("The "+fahrenheit+" fahrenheit is "+ celcius +" celcius");
	}
}