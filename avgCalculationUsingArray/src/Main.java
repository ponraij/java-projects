public class Main {
    public static void main(String[] args) {

        double arr[] = {1.2,3.1,5.3,6.2,8.9};
        double count = 0;
        int n = arr.length;
        System.out.println("length  : " + n);
        for(double item : arr){
            count += item;
        }
        System.out.println("Total   : " + count);
        double avg = count / n;
        System.out.println("Average : " + avg);
        System.out.format("Round   : %.0f" , avg);



    }
}