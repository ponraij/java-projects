import java.util.Scanner;
public class addTwoNumbers {
    public static void main(String[] args) {
        int a, b, result;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first  value ");
        a = in.nextInt();
        System.out.print("Enter the second value ");
        b = in.nextInt();
        result = a + b;
        System.out.print("Enter the result value " +  result);
    }
}