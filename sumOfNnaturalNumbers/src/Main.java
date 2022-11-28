import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number ");
        int number = in.nextInt();
        // store the value entered by user

        int n = 1, result = 0;

        while(n <= number){
            result += n;
            ++n;
        }

        System.out.println("Sum of " + number + " Natural is " + result);
    }
}