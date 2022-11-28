public class Main {
    public static void main(String[] args) {
        int row = 4,k=0;
        for(int i = 1; i <= row; ++i){

            for(int n=1 ; n <= row-i; n++){
                System.out.print("\t");
            }
            while(k != 2*i -1) {
                System.out.print("*\t");
                ++k;
            }
            k = 0;
            System.out.println();
        }
        }
    }