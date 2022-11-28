public class bitwiseOperator {
    public static void main(String[] args) {

        int a = 5, b = 3;
        // Assign values for a and b

        // Bitwise and operation
        System.out.println(a&b);

        // Bitwise or operation
        System.out.println(a|b);

        // 1's complement of b
        System.out.println(~b);

        // Right shift of a with 3 pos
        System.out.println(a>>3);

        // Left shift of a with 3 pos
        System.out.println(a<<3);

    }
}