import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("\n\t\t\tCheck Armstrong number\n\n"+"Enter a number ");
        int number = in.nextInt();
        in.close();
        // store the value entered by user

        int temp = number, result = 0;

        while (temp != 0){
            int reminder = temp % 10;
            result += Math.pow(reminder,3);
            temp /= 10;
        }

        boolean flag = (result == number) ? true : false;

        if(flag){
            System.out.println(number +" is Armstrong number \n");
        }
        else{
            System.out.println(number +" is not Armstrong number \n");
        }

    }
}