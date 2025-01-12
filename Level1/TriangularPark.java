/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run*/
import java.util.*;

class TriangularPark{
	public static int Perimeter(int a, int b, int c){
		int perimeter = a+b+c;
		return perimeter;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all three sides of triangular Park : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		TriangularPark obj = new TriangularPark();
		int perimeter = obj.Perimeter(a,b,c);
		
		int distance = 5000;     //1km= 1000m, 5km= 5*1000 => 5000m
		int round = distance/perimeter;
		
		System.out.println("The number of rounds user neeedto do to complete 5km rum :"+ round);
		
	}
}