import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the alphabet ");
        char alpha = input.next().charAt(0);

        int ASC = alpha;
        // alphabet to ASCII (number) conversion

        System.out.println("ASCII value of "+ alpha + " is " + ASC);

    }
}