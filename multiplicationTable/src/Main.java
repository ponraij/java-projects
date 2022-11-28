import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number ");
        int number = in.nextInt();
        // store the value entered by user
        int i = 1;
        while(i<=16){
            System.out.println(i + " x " + number + " = " + i*number);
            // Display value
            ++i;
        }
        in.close();
    }
}