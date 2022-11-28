import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter febinacci Series size ");
        int size = in.nextInt();
        int n1 = 0, n2 = 1, n3 = 0;
        System.out.print(n1 + "," + n2);
        for(int i = 0; i < size-2; i++){
            n3 = n1 + n2;
            System.out.print("," + n3);
            n1 = n2 ;
            n2 = n3;
        }
    }
}