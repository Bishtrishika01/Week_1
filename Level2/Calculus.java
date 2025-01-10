import java.util.*;

class Calculus{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int quotient = num1/num2;
		int remainder =num1 % num2;
		System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+num1+" and "+num2);
	}
}