import java.util.*;
public class foothillTime
{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Subjects:");
        System.out.println("");
        System.out.println("AP Calc BC = 1");
        System.out.println("Ceramics = 2");
        System.out.println("Freshman English = 3");
        System.out.println("AP US History = 4");
        System.out.println("AP Computer Science A = 5");
        System.out.println("Junior English = 6");
        System.out.println("Sophomore English = 7");
        System.out.println("Sport Entertaining Marketing = 8");
        System.out.println("AP Calc AB = 9");

        System.out.println("Enter what class you want to know about ( Enter a number ):");
        String a = scanner.nextLine();
        int x = Integer.parseInt(a);
        //System.out.println("Electives");

        if(x == 1)
        {
            boolean take = false;
            System.out.println("Teacher is Mrs. Kelly. Class average is 84.5%. Rating is 79/100.");
            System.out.print("Are you sure you want to take this course? (Y/N)");
            String b = scanner.nextLine();
            if(b.equals("Y")){
                take = true;
                System.out.println("I wish you the best of luck.");
            }
            if(b.equals("N")){
                take = false;
                System.out.println("Guess nobody's perfect.");
            }
        }
        else if(x == 2){
            boolean take = false;
            System.out.println("Teacher is Mrs. Beckner. Class average is 56.4%. Rating is 12/100.");
            System.out.print("Are you sure you want to take this course? (Y/N)");
            String b = scanner.nextLine();
            if(b.equals("Y")){
                take = true;
                System.out.println("I wish you the best of luck.");
            }
            if(b.equals("N")){
                take = false;
                System.out.println("Guess nobody's perfect.");
            }
        }
        else if(x == 4){
            boolean take = false;
            System.out.println("Teacher is Mr. Lipman. Class average is 87.3%. Rating is 100/100.");
            System.out.print("Are you sure you want to take this course? (Y/N)");
            String b = scanner.nextLine();
            if(b.equals("Y")){
                take = true;
                System.out.println("I wish you the best of luck.");
            }
            if(b.equals("N")){
                take = false;
                System.out.println("Guess nobody's perfect.");
            }
        }
        else if(x == 5){
            boolean take = false;
            System.out.println("Teacher is Mr. Sos. Class average is 92.1%. Rating is 100/100.");
            System.out.print("Are you sure you want to take this course? (Y/N)");
            String b = scanner.nextLine();
            if(b.equals("Y")){
                take = true;
                System.out.println("I wish you the best of luck.");
            }
            if(b.equals("N")){
                take = false;
                System.out.println("Guess nobody's perfect.");
            }
        }
        else if(x == 6){
            {
                boolean take = false;
                System.out.println("Teacher is Mrs. Pagtakhan. Class average is 85.7%. Rating is 100/100.");
                System.out.print("Are you sure you want to take this course? (Y/N)");
                String b = scanner.nextLine();
                if(b.equals("Y")){
                    take = true;
                    System.out.println("I wish you the best of luck.");
                }
                if(b.equals("N")){
                    take = false;
                    System.out.println("Guess nobody's perfect.");
                }
            }
            if(x==7){
                boolean take = false;
                System.out.println("Teacher is Mrs. Pratt. Class average is 94.6%. Rating is 87/100.");
                System.out.print("Are you sure you want to take this course? (Y/N)");
                String b = scanner.nextLine();
                if(b.equals("Y")){
                    take = true;
                    System.out.println("I wish you the best of luck.");
                }
                if(b.equals("N")){
                    take = false;
                    System.out.println("Guess nobody's perfect.");
                }
            }
            if(x == 8){
                boolean take = false;
                System.out.println("Teacher is Mrs. Raaker. Class average is 95%. Rating is 70/100.");
                System.out.print("Are you sure you want to take this course? (Y/N)");
                String b = scanner.nextLine();
                if(b.equals("Y")){
                    take = true;
                    System.out.println("I wish you the best of luck.");
                }
                if(b.equals("N")){
                    take = false;
                    System.out.println("Guess nobody's perfect.");
                }
            }
            if(x == 9){
                boolean take = false;
                System.out.println("Teacher is Mrs. Bisagno. Class average is 100%. Rating is 100/100.");
                System.out.print("Are you sure you want to take this course? (Y/N)");
                String b = scanner.nextLine();
                if(b.equals("Y")){
                    take = true;
                    System.out.println("I wish you the best of luck.");
                }
                if(b.equals("N")){
                    take = false;
                    System.out.println("Guess nobody's perfect.");
                }
            }
        }
    }
}