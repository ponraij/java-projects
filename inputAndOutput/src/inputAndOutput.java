

import java.util.Scanner;

public class inputAndOutput {

    public static void main(String[] args) {

        int number = 10;

        System.out.println("1. println ");
        System.out.println("2. println ");

        System.out.print("1. print ");
        System.out.print("2. print");

        System.out.println("\nI am " + "awesome.");
        // Here, we have used the + operator
        // to concatenate (join) the two strings

        System.out.println("Number = " + number);
        // Here, first the value of variable number is evaluated.
        // Then, the value is concatenated to the string: "Number = "

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        number = input.nextInt();
        System.out.println("You entered " + number);
        input.close();
    }
}
