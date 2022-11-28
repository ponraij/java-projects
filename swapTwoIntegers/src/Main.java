import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first value ");
        int n1 = in.nextInt();
        System.out.print("Enter Second value ");
        int n2 = in.nextInt();

        // Swap two program without using temporary value

        n2 = n2 + n1;
        n1 = n2 - n1;
        n2 = n2 - n1;

        System.out.print("After swaping " + "\n\tFirst  value "+ n1 + "\n\tSecond value " + n2);

    }
}