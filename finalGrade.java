import java.util.*;

/**
 * Write a description of class finalGrade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class finalGrade
{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Current grade: ");
        String a = scanner.nextLine();
        double current = Integer.parseInt(a);
        
        System.out.println("Percent of final: ");
        String b = scanner.nextLine();
        double finalPercent = Integer.parseInt(b);
        
        System.out.println("What grade do you want in the class? ");
        String c = scanner.nextLine();
        double gradeWanted = Integer.parseInt(c);
        
        double gradeNeeded = 0;
        
        double x = (1-(finalPercent/100));
        double y = x * current;
        double z = gradeWanted - y;
        gradeNeeded = ((z/ (finalPercent)) *100);
        
        System.out.println("You need " + gradeNeeded + "% to get a " + gradeWanted + " in the class.");
        
        
        
    }

}
