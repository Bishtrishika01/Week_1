/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false */
import java.util.*;

class Spring{
	public boolean isSpringSeason(int month,int day){
	if(((month==3)&&(day>=20))||(month==4)||(month==5)||((month==6)&&(day<=20))){
			System.out.println("It's Spring Season");
			return true;
		}
		else{
			System.out.println("It's not Spring Season");
			return false;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month : ");
		int month = sc.nextInt();
		System.out.println("Enter day : ");
		int day = sc.nextInt();
		
		Spring obj = new Spring();
		obj.isSpringSeason(month,day);
	}
}