import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many student names you need to store ? ");
        int n = in.nextInt();
        String names[] = new String[n];
        int i = 0;
        while(i < n){
            names[i] = in.next();
            ++i;
        }
        System.out.println(Arrays.toString(names));
    }
}