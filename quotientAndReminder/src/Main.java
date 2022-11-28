import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, quotient, reminder;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first  value ");
        a = in.nextInt();
        System.out.print("Enter the second value ");
        b = in.nextInt();

        quotient = a / b; // expression to calculate quotient value
        reminder = a % b; // expression to calculate reminder value

        System.out.print("Quotient value is " + quotient + "\n" + "reminder value is " + reminder);
        // displays the Quotient and reminder values
    }
}