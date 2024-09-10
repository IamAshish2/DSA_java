package RecursionBeginner;
// calculate stack height = n

public class XToThePowN {
    public static void main(String[] args) {
        System.out.println(calculatePower(2,4));
        System.out.println(calculateStackHeight(2,5));
    }

//    height = n
    static int calculatePower(int x , int n) {
        if(n == 0){
            return 1;
        }

        if(x == 0){
            return  0;
        }

        int xPownm1 = calculatePower(x,n-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    //calculate x^n (stack height  = logn)
    static int calculateStackHeight(int x,int n){
        if(n == 0){
            return 1;
        }

        if(x == 0){
            return  0;
        }

        // if n is even
        if(n % 2 == 0 ){
            return calculatePower(x,n/2) * calculatePower(x,n/2);
        } else{ // n is odd
            return calculatePower(x,n/2) * calculatePower(x,n/2) * x;
        }
    }
}
