import java.util.*;

public class IntOperation{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int operation1 = a+b*c;
		int operation2 = a*b+c;
		int operation3 = c+a/b;
		int operation4 =  a % b + c;
		System.out.println("The result are: "+"\n a + b * c = "+operation1+"\n a * b + c = "+operation2+"\n c + a / b = "+operation3+"\n a % b + c = "+operation4);
	}
}