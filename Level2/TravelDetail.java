import java.util.Scanner;

public class TravelDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter the city you are traveling from: ");
        String fromCity = scanner.nextLine();
        
        System.out.print("Enter the city you are traveling via: ");
        String viaCity = scanner.nextLine();
        
        System.out.print("Enter the final destination city: ");
        String finalCity = scanner.nextLine();
        
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();
        
        System.out.print("Enter the distance from " + viaCity + " to " + finalCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();
        
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in hours: ");
        double fromToViaTime = scanner.nextInt();
		
		System.out.println("Enter the time taken from "+viaCity+" to "+finalCity+" in hours: ");
        double ViaToFinalTime = scanner.nextDouble();
		
        // Output the results
        System.out.println("\nTravel Details:");
        System.out.println("Traveler Name: " + name);
        System.out.println("Traveling from: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + finalCity);
        System.out.println("Distance from " + fromCity + " to " + viaCity + ": " + fromToVia + " miles");
        System.out.println("Distance from " + viaCity + " to " + finalCity + ": " + viaToFinalCity + " miles");
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in hours: " + fromToViaTime);
		System.out.println("Enter the time taken from "+viaCity+" to "+finalCity+" in hours: "+ ViaToFinalTime);

        // Optionally, you can calculate average speed
        double totalDistance = fromToVia + viaToFinalCity;
		double totalTIme = fromToViaTime + ViaToFinalTime;
        
        System.out.println("Total distance: " +totalDistance+" miles "+" and Total time taken "+totalTIme+" hours.");
    }
}
