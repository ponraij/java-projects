import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number ");
        int number = in.nextInt();

        int temp = number, result = 0;

        while(temp != 0){
            int reminder = temp % 10;
            result = ( result * 10 ) + reminder;
            temp /= 10;
        }

        System.out.println("reverced  number " + result);

        if(number == result){
            System.out.println(number +" is palindrome");
        }
        else {
            System.out.println(number + " is not palindrome");
        }
    }
}