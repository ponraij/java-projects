import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number ");
        int number = in.nextInt();
        // store the value entered by user

        System.out.println("you entered " + number);
        // Display value

        in.close();
    }
}