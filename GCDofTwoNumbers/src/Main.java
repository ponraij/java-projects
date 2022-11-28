import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value ");
        int value_1 = in.nextInt();

        System.out.print("Enter the another value ");
        int value_2 = in.nextInt();

        int flag = (value_1 < value_2) ? value_1 : value_2;
        int i = 1, result = 0;

        while(i <= flag){
            if((value_1 % i == 0) && (value_2 % i == 0)){
                result = i;
            }
            ++i;
        }
        System.out.println("GCD of "+ value_1 + " and "+ value_2 + " is " + result);

    }
}
//import java.util.Scanner;
//System.out.println();
//close.in();