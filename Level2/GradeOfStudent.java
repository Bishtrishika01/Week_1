import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {
        //Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take marks as input
        System.out.print("Enter physics marks: ");
        int phy_marks = sc.nextInt();
        System.out.print("Enter chemistry marks: ");
        int chem_marks = sc.nextInt();
        System.out.print("Enter maths marks: ");
        int maths_marks = sc.nextInt();

        // calculate the percentage
        int percentage = (phy_marks + chem_marks + maths_marks)/3;
        //conditions to display the remark
        if(percentage>=80){
        System.out.println("Average Marks is "+percentage +" , grade is Level 4 and remark is above agency-normalized standards");}
        else if(percentage>=70 && percentage<80){
        System.out.println("Average Marks is "+percentage +" , grade is Level 3 and remark is at agency-normalized standards");}
        else if(percentage>=60 && percentage<70){
        System.out.println("Average Marks is "+percentage +" , grade is Level 2 and remark is below, but approaching agency-normalized standards");}
        else if(percentage>=50 && percentage<60){
        System.out.println("Average Marks is "+percentage +" , grade is Level 1 and remark is well below agency-normalized standards");}
        else if(percentage>=40 && percentage<50){
        System.out.println("Average Marks is "+percentage +" , grade is Level 1- and remark is too below agency-normalized standards");}
        else{
        System.out.println("Average Marks is "+percentage +" and remark is too below agency-normalized standards");}

    }
}