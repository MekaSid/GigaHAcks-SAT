import java.util.*;
public class futureClasses
{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Catagories:");
        System.out.println("");
        System.out.println("Math = 1");
        System.out.println("Science = 2");
        System.out.println("History = 3");
        System.out.println("Athletics = 4");
        System.out.println("English = 5");
        System.out.println("Enter what you wish to major in ( Enter a number ):");
        String a = scanner.nextLine();
        int x = Integer.parseInt(a);
        //System.out.println("Electives");

        if(x == 1)
        {
            System.out.println("Here's a list of high school classes you should consider for a math major:");
            System.out.println("AP Statistics");
            System.out.println("Trigonometry");
            System.out.println("AP Calculus BC");
            System.out.println("Multi-variable Calculus");
            System.out.println("AP Computer Science A or P");
        }
        else if(x == 2){
            System.out.println("Here's a list of high school classes you should consider for a science major:");
            System.out.println("For biology field: Biology, AP biology, AP chemistry, AP Environmental Sciences, Principles of Biomedical Sciences, Honors human body systems");
            System.out.println("For chemistry field: AP chemistry, AP Calculus AB or BC, Computer Science, AB Physics B or C");
            System.out.println("For physics field: Physics B or 1, Multivariable Calculus, AP Phyics C");
        }
        else if(x == 3){
                        System.out.println("Here's a list of high school classes you should consider for a history major:");

            System.out.println("AP World History Modern or Ancient");
            System.out.println("AP US History");
            System.out.println("World History");
            System.out.println("Honors World History");
            System.out.println("US History");
            System.out.println("Social Studies");
            System.out.println("AP Gov");
            System.out.println("AP ECON");
        }
        else if(x == 4){
            System.out.println("Here's a list of high school sports you should consider:");

            System.out.println("Track");
            System.out.println("Cross Country");
            System.out.println("Volleyball");
            System.out.println("Basketball");
            System.out.println("Football");
            System.out.println("Soccer");
            System.out.println("Golf");
            System.out.println("Waterpolo");
            System.out.println("Swim");
            System.out.println("Dive");
            System.out.println("Rowing");

        }
        else
        {
            System.out.println("Here's a list of high school classes you should consider for a english major:");

            System.out.println("Regular English");
            System.out.println("Honors English");
            System.out.println("AP Lit");
            System.out.println("AP Lang");
        }

    }
}