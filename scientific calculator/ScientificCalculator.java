import java.util.*;

public class ScientificCalculator {

    public static Scanner input = new Scanner(System.in);
    public static void main (String [] args ){
        menu();
        


    }


    public static int  menu() {
        
        boolean loopSwitch = true ;

        while (loopSwitch) {

            System.out.println("1.Addition (+)");
            System.out.println("2.Subtraction (-)");
            System.out.println("3.Multiplication (*)");
            System.out.println("4.Division (/)");
            System.out.println("5.Square Root (√x)");
            System.out.println("6.Power (x^y)");
            System.err.println("7.Sine (sin(x))");
            System.out.println("8.Tangent(tan(x))");
            System.out.println("9.Natural Logarithm (lnx)");
            System.out.println("10.Logarithm Base 10 (log10x)");
            System.out.println("11.AbsoluteValue");
            System.out.println("12.Round (to nearest long)");
            System.out.println("13.Ceiling (round up)");
            System.out.println("14.Floor (round down)");
            System.out.println("14.Minimum of two numbers");
            System.out.println("15.Maximum of two numbers");
            System.out.println("16.Helper methods");
            System.out.println("17.Exit");
            System.out.print("chose Number : ");
            int menuChose = input.nextInt();

            if (menuChose > 0 && menuChose <= 17){
                loopSwitch = false;
                return menuChose ;
            }
            System.out.println("no item fiend pleas chose from 1 to 17 ");

        }

        return 0;

    }
}
