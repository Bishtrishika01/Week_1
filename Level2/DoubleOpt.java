import java.util.*;

public class DoubleOpt{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number : ");
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double operation1 = a+b*c;
		double operation2 = a*b+c;
		double operation3 = c+a/b;
		double operation4 =  a % b + c;
		System.out.println("The result are: "+"\n a + b * c = "+operation1+"\n a * b + c = "+operation2+"\n c + a / b = "+operation3+"\n a % b + c = "+operation4);
	}
}