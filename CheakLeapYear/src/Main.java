import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Year ");
        int year = in.nextInt();
        // use conditional operator
        String flag = ( (year % 4 )== 0 ) ? " is leap year." : " is Not leap year.";
        System.out.println(year + flag);

    }
}