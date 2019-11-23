
import java.util.*;

public class unweighted
{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of classes: ");
        String numClas = scanner.nextLine();


        System.out.println("Unweighted: ");
        System.out.println("A = 4");
        System.out.println("B = 3");
        System.out.println("C = 2");
        System.out.println("D = 1");
        System.out.println("F = 0"); 
        
        double val = 0;
        
        int classes = Integer.parseInt(numClas);
        int[] allClasses = new int[classes];
        for(int i = 0; i < classes; i++)
        {
            System.out.println("Grade value of class number " + (i+1) + ":");
            String a = scanner.nextLine();
            int b = Integer.parseInt(a);
            allClasses[i] = b;
            val += b;

        }
        
        double gpa = val/classes;
        System.out.println("Your GPA is: " + gpa);

    }
}