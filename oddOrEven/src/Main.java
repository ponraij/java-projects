import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number ");
        int value = in.nextInt();

        String result = (value % 2 == 0) ? "even number" : "odd number";

        System.out.println(value + " is " + result);

        in.close();
    }
}