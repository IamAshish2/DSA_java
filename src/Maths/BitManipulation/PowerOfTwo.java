package BitManipulation;

//Write a program to find if a number is a power of 2 or not.
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(64));
        System.out.println(isPowerOfTwo(54));
    }

    static boolean isPowerOfTwo(int num){
        // n > 0 && (n & (n-1) == 0)
        return num > 0 && (num & (num-1)) == 0;
    }
}
