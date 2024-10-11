package Recursion2.Refresher;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    /*
    static int reverse2(int num) {
        int sum = 0;
        while (num != 0){
            int rem = num % 10;
            sum = sum * 10 +  rem;
            num/=10;
        }
        return sum;
    }
     */

    // recursive method to reverse a number
    public static int reverse(int num){
        // the Math.log10(num) will return the digits = actual number of digits - 1 i.e. 0 indexed
        int digits = (int) Math.log10(num);
        return  helper(num,digits);
    }

    public static int helper(int num,int digits){
        if(num % 10 == num){
            return num;
        }
        return  num % 10 * (int) Math.pow(10,digits) + helper(num/10,digits-1);
    }
}
