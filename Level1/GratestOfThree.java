import java.util.*;

 class GratestOfThree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter First no. : ");
	    int num1 = sc.nextInt();            //first no.
	    System.out.println("Enter Second no. : ");
	    int num2 = sc.nextInt();            //second no.
	    System.out.println("Enter Third no. : ");
	    int num3 = sc.nextInt(); 	//third no.
	    if(num1>num2){
		    System.out.println("Is the first number the largest?");
		    if(num1>num3){
			    System.out.println("Yes");
			}
            else{
			    System.out.println("Yes");
			}			
	    }
	    else{
			if (num2>num3){
				System.out.println("Is the second number the largest? "+"Yes");
			}
		    else{
				System.out.println("Is the third number the largest? "+"Yes");
			}
	    }
    }
}