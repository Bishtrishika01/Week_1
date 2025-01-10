import java.util.*;

public class SwapTwoNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no. : ");
		int a = sc.nextInt();
		System.out.println("Enter second no. : ");
		int b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The swapped numbers are "+ a +" and "+ b);
	}
}