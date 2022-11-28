public class Main {
    public static void main(String[] args) {

        int arr[] = { -7, -2, -3, -4, -5, -12, -7, -8, -9 };
        int max = arr[0];

        for(int value : arr){
            if (max < value){
                max = value;
            }
        }

        System.out.println(max);

    }
}