//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("\n\t\t\t\tArmstrong numbers between two intervals \n\nEnter begin number ");
//        int begin = in.nextInt();
//        System.out.print("Enter end number ");
//        int end = in.nextInt();
//        in.close();
        int begin = -5, end = 200;

        if(begin >= end){
            System.out.println("\nInvalid input :) \n");
            System.exit(0);
        }

        while(begin < end){

            int temp = begin, result = 0;


            if ((temp > -10)&&(temp < 10)){
                System.out.print(begin + " ");
            }
            else {
                while (temp != 0) {

                    int reminder = temp % 10;
                    result += Math.pow(reminder,3);
                    temp /= 10;
                }

                if(result == begin){
                    System.out.print(begin +" ");
                }
            }

            ++begin;
        }
    }
}
