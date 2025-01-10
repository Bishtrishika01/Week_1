import java.util.Scanner;
public class UserDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String name = input.nextLine();
        String email = input.nextLine();
        int age = input.nextInt();
        int phone = input.nextInt();
        
        System.out.println("User Contact Details:");
        System.out.println("Name : "+name);
        System.out.println("Name : "+email);
        System.out.println("Name : "+age);
        System.out.println("Name : "+phone);
        System.out.println("Thankyou for your details");
        System.out.println("Wait for few minute!");
        input.close();
    }
}
