import java.util.*;

public class SmallestOfThree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter First no. : ");
	    int num1 = sc.nextInt();            //first no.
	    System.out.println("Enter Second no. : ");
	    int num2 = sc.nextInt();            //second no.
	    System.out.println("Enter Third no. : ");
	    int num3 = sc.nextInt(); 	//third no.
	    System.out.println("Is the first number the smallest? ");
	    if(num1<num2&&num1<num3){
			System.out.println("Yes");
	    }
	    else{
		    System.out.println("No");
	    }
    }
}