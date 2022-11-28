import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        float a, b, result;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first  value ");
        a = in.nextFloat();
        System.out.print("Enter the second value ");
        b = in.nextFloat();
        result = a * b;
        System.out.print("Enter the result value " +  result);
    }
}