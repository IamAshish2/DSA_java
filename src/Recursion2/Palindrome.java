package Recursion2;

public class Palindrome {
    public static void main(String[] args) {
        int num = 324;
        int reverse = reverseNum(324,0);
        System.out.println(num == reverse);
    }

    static int reverseNum(int num, int rev){

        if(num == 0 ){
            return rev;
        }

        return reverseNum(num/10,rev * 10 +  num%10);
    }
}
