import java.util.*;

public class ScientificCalculator {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int menuChose = menu();
        switch (menuChose) {
            case 1:
                Addition();
                break;

            default:
                break;
        }

    }

    public static int menu() {

        boolean loopSwitch = true;

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
            System.out.println("chose Number : ");
            int menuChose = input.nextInt();

            if (menuChose > 0 && menuChose <= 17) {
                loopSwitch = false;
                return menuChose;
            }
            System.out.println("no item fiend pleas chose from 1 to 17 ");

        }

        return 0;

    }

    public static void Addition() {
        System.out.println("1.integer");
        System.out.println("2.Double");
        System.out.println("chose type :");
        int typeChose = input.nextInt();
        if (typeChose == 1) {
            System.out.println("Enter first number :");
            int num1 = input.nextInt();
            System.out.println("Enter Second number :");
            int num2 = input.nextInt();
            int resolt = num1 + num2;
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                Addition();

            } else {
                main(null);
            }
        } else if (typeChose == 2) {
            System.out.println("Enter first number :");
            Double num1 = input.nextDouble();
            System.out.println("Enter Second number :");
            Double num2 = input.nextDouble();
            Double resolt = num1 + num2;
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                Addition();

            } else {
                main(null);
            }
        }

    }

    public static int askToDoAgine() {
        System.err.println("contenue in same Opretion");
        System.out.println("1.Yes");
        System.out.println("2.No");
        int chose = input.nextInt();

        if (chose > 0 && chose < 3) {
            return chose;
        } else {
            System.out.println("Chose 1 or 2");
            askToDoAgine();
        }
        return 0;
    }
}
