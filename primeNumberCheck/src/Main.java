import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("\n\t\t\t\tPrime numbers between two intervals \n\n"+ "Enter begin number ");
        int begin = in.nextInt();

        System.out.print("Enter end number ");
        int end = in.nextInt();

        in.close();

        if((begin < 0) && (end < 0)){
            System.out.println("\n\t\t\tNo prime numbers between the interval");
            System.exit(0);
        }

        if (begin > end){
            begin = begin + end;
            end = begin - end;
            begin = begin - end;
        }

        System.out.println("\n\t\t\tPrime numbers are \n");

        while (begin < end) {
            boolean flag = true;

            if (begin > 0) {

                for (int i = 2; i <= begin / 2; i++) {
                    if ((begin % i) == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    System.out.print(begin + " ");
                }

            }
            ++begin;
        }
        System.out.println(" ");

    }
}