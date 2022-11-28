import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Decimal Value ");
        double number = in.nextDouble();
        System.out.format("%.3f",number);
    }
}