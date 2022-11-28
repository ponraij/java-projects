import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\n\t\t\tSimple Calculator\n\n");
        System.out.print("Enter a number ");
        float number_1 = in.nextFloat();
        System.out.print("Enter a number ");
        float number_2 = in.nextFloat();
        float n;

        System.out.print("\n\t\tChoose any one operation\n\n"+"+\t-\t*\t/\n");
        char operator = in.next().charAt(0);

        in.close();

        switch (operator){
            case '+':
                n = number_1 + number_2;
                System.out.println( "\n" + number_1 + " + " + number_2 + " = " + n);
                break;
            case '-':
                n = number_1 - number_2;
                System.out.println( "\n" + number_1 + " - " + number_2 + " = " + n);
                break;
            case '*':
                n = number_1 * number_2;
                System.out.println( "\n" + number_1 + " * " + number_2 + " = " + n);
                break;

            case '/':
                n = number_1 / number_2;
                System.out.println( "\n" + number_1 + " / " + number_2 + " = " + n);
                break;

            default:
                System.out.println("Invalid operator '" + operator + "'");
                break;
        }
    }
}