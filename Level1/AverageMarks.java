/*Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ */
public class AverageMarks {
    public static void main(String[] args) {
        
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        
        int totalMarks = maths + physics + chemistry;

        
        int numberOfSubjects = 3;

        
        double averageMarks = totalMarks / (double) numberOfSubjects;

       
        System.out.printf("Sam's average mark in PCM is %.2f%n", averageMarks);
    }
}