package Recursion2;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse2(4321));
    }

    static int reverse(int n){
        if (n % 10 == n){
            return  n;
        }

        return  10 * (reverse((n%10)) + reverse(n/10));
    }

    static int reverse2(int num) {
        int sum = 0;
        while (num != 0){
            int rem = num % 10;
            sum = sum * 10 +  rem;
            num/=10;
        }
        return sum;
    }


}
