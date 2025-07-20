import java.util.*;

public class ScientificCalculator {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int menuChose = menu();
        switch (menuChose) {
            case 1:
                Addition();
                break;
            case 2:
                Subtraction();
                break;
            case 3:
                Multiplication();
                break;
            case 4:
                Division();
                break;
            case 5:
                SquareRoot();
                break;
            case 6:
                powerOf();
                break;
            case 7:
                sin();
                break;
            case 8:
                tan();
                break;
            case 9:
                ln();
                break;
            case 10:
                ln10();
                break;
            case 11:
                AbsoluteValue();
                break;
            case 12:
                round();
                break;
            case 13:
                Ceiling();
                break;
            case 14:
                Floor();
                break;
            case 15:
                minNum();
                break;
            case 16:
                maxNum();
                break;
            default:
                System.out.println("thank you ");
                System.exit(0);
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
            System.out.println("15.Minimum of two numbers");
            System.out.println("16.Maximum of two numbers");
            System.out.println("0.Exit");
            System.out.println("chose Number : ");
            int menuChose = input.nextInt();

            if (menuChose > -1 && menuChose <= 16) {
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

    public static void Subtraction() {
        System.out.println("1.integer");
        System.out.println("2.Double");
        System.out.println("chose type :");
        int typeChose = input.nextInt();
        if (typeChose == 1) {
            System.out.println("Enter first number :");
            int num1 = input.nextInt();
            System.out.println("Subtraction");
            System.out.println("Enter Second number :");
            int num2 = input.nextInt();
            int resolt = num1 - num2;
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                Subtraction();

            } else {
                main(null);
            }
        } else if (typeChose == 2) {
            System.out.println("Enter first number :");
            Double num1 = input.nextDouble();
            System.out.println("Subtraction");
            System.out.println("Enter Second number :");
            Double num2 = input.nextDouble();
            Double resolt = num1 - num2;
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                Subtraction();

            } else {
                main(null);
            }
        }

    }

    public static void Multiplication() {
        System.out.println("1.integer");
        System.out.println("2.Double");
        System.out.println("chose type :");
        int typeChose = input.nextInt();
        if (typeChose == 1) {
            System.out.println("Enter first number :");
            int num1 = input.nextInt();
            System.out.println("Enter Second number :");
            int num2 = input.nextInt();
            int resolt = num1 * num2;
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                Multiplication();

            } else {
                main(null);
            }
        } else if (typeChose == 2) {
            System.out.println("Enter first number :");
            Double num1 = input.nextDouble();
            System.out.println("Enter Second number :");
            Double num2 = input.nextDouble();
            Double resolt = num1 * num2;
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                Multiplication();

            } else {
                main(null);
            }
        }

    }

    public static void Division() {
        System.out.println("1.integer");
        System.out.println("2.Double");
        System.out.println("chose type :");
        int typeChose = input.nextInt();
        if (typeChose == 1) {
            System.out.println("Enter first number :");
            int num1 = input.nextInt();
            System.out.println("Division");
            System.out.println("Enter Second number :");
            int num2 = input.nextInt();
            int resolt = num1 / num2;
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                Division();

            } else {
                main(null);
            }
        } else if (typeChose == 2) {
            System.out.println("Enter first number :");
            Double num1 = input.nextDouble();
            System.out.println("Division");
            System.out.println("Enter Second number :");
            Double num2 = input.nextDouble();
            Double resolt = num1 / num2;
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                Division();

            } else {
                main(null);
            }
        }

    }

    public static void SquareRoot() {
        System.out.println("Enter number :");
        Double num1 = input.nextDouble();
        Double resolt = Math.sqrt(num1);
        System.out.println("resoult : " + resolt);
        int repeat = askToDoAgine();
        if (repeat == 1) {
            SquareRoot();

        } else {
            main(null);
        }

    }

    public static void powerOf() {
        System.out.println("Enter first number :");
        Double num1 = input.nextDouble();
        System.out.println("power of");
        System.out.println("Enter Second number :");
        Double num2 = input.nextDouble();
        Double resolt = Math.pow(num1, num2);
        System.out.println("resoult : " + resolt);
        int repeat = askToDoAgine();
        if (repeat == 1) {
            powerOf();

        } else {
            main(null);
        }
    }

    public static void sin() {
        System.out.println("Enter number :");
        Double num1 = input.nextDouble();
        Double resolt = Math.sin(num1);
        System.out.println("resoult : " + resolt);
        int repeat = askToDoAgine();
        if (repeat == 1) {
            sin();

        } else {
            main(null);
        }

    }

    public static void tan() {
        System.out.println("Enter number :");
        Double num1 = input.nextDouble();
        Double resolt = Math.tan(num1);
        System.out.println("resoult : " + resolt);
        int repeat = askToDoAgine();
        if (repeat == 1) {
            tan();

        } else {
            main(null);
        }

    }

    public static void ln() {
        System.out.println("Enter number :");
        Double num1 = input.nextDouble();
        Double resolt = Math.log(num1);
        System.out.println("resoult : " + resolt);
        int repeat = askToDoAgine();
        if (repeat == 1) {
            ln();

        } else {
            main(null);
        }

    }

    public static void ln10() {
        System.out.println("Enter number :");
        Double num1 = input.nextDouble();
        Double resolt = Math.log10(num1);
        System.out.println("resoult : " + resolt);
        int repeat = askToDoAgine();
        if (repeat == 1) {
            ln10();

        } else {
            main(null);
        }

    }

    public static void AbsoluteValue() {
        System.out.println("1.integer");
        System.out.println("2.Double");
        System.out.println("chose type :");
        int typeChose = input.nextInt();
        if (typeChose == 1) {
            System.out.println("Enter  number :");
            int num1 = input.nextInt();
            int resolt = Math.abs(num1);
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                AbsoluteValue();

            } else {
                main(null);
            }
        } else if (typeChose == 2) {
            System.out.println("Enter first number :");
            Double num1 = input.nextDouble();
            Double resolt = Math.abs(num1);
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                AbsoluteValue();

            } else {
                main(null);
            }
        }

    }

    public static void round() {
        System.out.println("Enter number :");
        Double num1 = input.nextDouble();
        int resolt = (int) Math.round(num1);
        System.out.println("resoult : " + resolt);
        int repeat = askToDoAgine();
        if (repeat == 1) {
            round();

        } else {
            main(null);
        }

    }

    // Ceiling
    public static void Ceiling() {
        System.out.println("Enter number :");
        Double num1 = input.nextDouble();
        int resolt = (int) Math.ceil(num1);
        System.out.println("resoult : " + resolt);
        int repeat = askToDoAgine();
        if (repeat == 1) {
            Ceiling();

        } else {
            main(null);
        }

    }

    // Floor
    public static void Floor() {
        System.out.println("Enter number :");
        Double num1 = input.nextDouble();
        int resolt = (int) Math.floor(num1);
        System.out.println("resoult : " + resolt);
        int repeat = askToDoAgine();
        if (repeat == 1) {
            Floor();

        } else {
            main(null);
        }

    }

    // minNum
    public static void minNum() {
        System.out.println("1.integer");
        System.out.println("2.Double");
        System.out.println("chose type :");
        int typeChose = input.nextInt();
        if (typeChose == 1) {
            System.out.println("Enter first number :");
            int num1 = input.nextInt();
            System.out.println("Enter Second number :");
            int num2 = input.nextInt();
            int resolt = Math.min(num1, num2);
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                minNum();

            } else {
                main(null);
            }
        } else if (typeChose == 2) {
            System.out.println("Enter first number :");
            Double num1 = input.nextDouble();
            System.out.println("Enter Second number :");
            Double num2 = input.nextDouble();
            Double resolt = Math.min(num1, num2);
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                minNum();

            } else {
                main(null);
            }
        }

    }

    public static void maxNum() {
        System.out.println("1.integer");
        System.out.println("2.Double");
        System.out.println("chose type :");
        int typeChose = input.nextInt();
        if (typeChose == 1) {
            System.out.println("Enter first number :");
            int num1 = input.nextInt();
            System.out.println("Enter Second number :");
            int num2 = input.nextInt();
            int resolt = Math.max(num1, num2);
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                minNum();

            } else {
                main(null);
            }
        } else if (typeChose == 2) {
            System.out.println("Enter first number :");
            Double num1 = input.nextDouble();
            System.out.println("Enter Second number :");
            Double num2 = input.nextDouble();
            Double resolt = Math.max(num1, num2);
            System.out.println("resoult : " + resolt);
            int repeat = askToDoAgine();
            if (repeat == 1) {
                maxNum();

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
