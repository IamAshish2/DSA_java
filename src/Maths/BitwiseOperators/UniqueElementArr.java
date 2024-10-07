package BitwiseOperators;

public class UniqueElementArr {
    public static void main(String[] args) {
        int [] arr = {2,3,9,8,44,44,9,3,2};
        System.out.println(uniqueElement(arr));
    }

    private static int uniqueElement(int[] arr) {
        int value = 0;
        /*
        key: a ^ a = 0
            a ^ 0 = a
         */
        for (int j : arr) {
            value ^= j;
        }
        return value;
    }
}
