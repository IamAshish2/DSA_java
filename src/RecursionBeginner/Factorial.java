package RecursionBeginner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println( Factorial(5));
    }

    // recursive function to calculate factorial of a number num
    static int Factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }

        return num * Factorial((num-1));
    }
}
