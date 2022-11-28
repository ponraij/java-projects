import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // copy Array using ' = ' assignment operator
        int [] array1 = { 1, 2, 3, 4, 5, 6};
        int [] array2 = new int[6];

        array2 = array1;
        array1[1] = 0;
        // display array elements using Array.toString(arrayName) method
        System.out.println(Arrays.toString(array2));


        // Using Looping Construct to Copy Arrays
        int  array3[] = new int[6];
        for(int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
        }
        array1[1] = 2;
        // display array elements using Array.toString(arrayName) method
        System.out.println(Arrays.toString(array3));


        // using Arrays.ofCopy method

        int [] array4 = { 1, 2, 3, 4, 5, 6};
        int array5[] = new int[6];
        System.arraycopy( array4, 0, array5, 4,2);
        // display array elements using Array.toString(arrayName) method
        System.out.println(Arrays.toString(array5));

        // using Arrays.copyOfRange method

        int array6[] = Arrays.copyOfRange(array4,0,7) ;
        System.out.println(Arrays.toString(array6));


        // Using Looping Construct to Copy 2D Arrays
        int array7[][] ={ {1, 2, 3, 4, 5, 6},{11, 12, 13,14, 15, 16},{21, 22, 23}};
        int  array8[][] = new int[6][6];
        for(int i = 0; i < array7.length; i++){
           System.arraycopy(array7[i],0,array8[i], 0,6);
           break;
        }
        // display array elements using Array.toString(arrayName) method
        System.out.println(Arrays.toString(array8[0]));


    }
}