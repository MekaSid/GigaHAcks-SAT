import java.util.*;

/**
 * Write a description of class scheduleMaker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scheduleMaker
{
    public void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many classes do you have?: ");
        String a = scanner.nextLine();

        System.out.println("How much time can you do for homework?");
        String c = scanner.nextLine();
        int time = Integer.parseInt(c);

        int classes = Integer.parseInt(a);
        int total = 0;
        for(int i = 0; i < classes; i++)
        {
            System.out.println("How many minutes of homework do you have for period" + i+1 + "?");
            String b = scanner.nextLine();
            int min = Integer.parseInt(b);
            total += min;
        }

        if(total > time)
        {
            System.out.println("You do not have enough time to do your homework. Work harder and try to make some time.");
        }
        else
        {
            System.out.println("You have enough time to do your homework!!!");
        }
        
    }
}