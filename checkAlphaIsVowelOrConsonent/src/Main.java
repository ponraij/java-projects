
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the alphabet ");
        char alpha = input.next().charAt(0);

        switch (alpha) {
            case 'A' :
            case 'B' :
            case 'I' :
            case 'O' :
            case 'U' :
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :

                System.out.println ("vowel");
                break;

            default:
                System.out.println("not vowel");
        }

        System.out.println();
    }
}
