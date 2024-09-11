package Recursion.RecursionBeginner;
//Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.
public class GDC {
    public static void main(String[] args) {
        System.out.println( gcdIterative(16,18));
    }

    static int findGcd(int a , int b){
        if(b ==0){
            return a;
        }
        return findGcd(b,b%a);
    }

    static int gcdIterative(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
