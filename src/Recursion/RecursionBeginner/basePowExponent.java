package Recursion.RecursionBeginner;
//Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).
public class basePowExponent {
    public static void main(String[] args) {
        System.out.println( calculatePow(2,5));
    }

    static int calculatePow(int base,int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * calculatePow(base,exponent-1);
    }
}
