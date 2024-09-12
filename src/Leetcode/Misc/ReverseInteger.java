package Leetcode.Misc;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(456));

    }

    public static int reverse(int x) {
        int rev = 0;
        int max = Integer.MAX_VALUE; //2,147,483,647
        int min = Integer.MIN_VALUE; // - 2,147,483,647

        while (x != 0) {
            int poppedValue = x % 10;
            x /= 10;
            // edge cases so the reversed digit does not exceed the 32-bit signed integer limit
            // in every iteration if at any point reverse is greater than maxValue/10 i.e. max value
            // excluding the last digit ,  multiplying it by 10 will cause an  overflow.
            // And if the reverse == max / 10 and the last popped value is greater than 7
            // it will cause an overflow if added with the rev later. so we return 0;
            // same thing applies in opposite case.
            if(rev > max/10 || (rev == max / 10 && poppedValue > 7)) return 0;
            if(rev < min /10 || (rev == min /10 && poppedValue < -8)) return  0;

            rev = rev * 10 + poppedValue;
        }
        return rev;
    }
}
