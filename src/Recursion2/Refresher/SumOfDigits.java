package Recursion2.Refresher;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }

    // recursive method
    static int sumOfDigits(int num){
        /* if used num / 10 at first
        if (num == 0){
            return 0;
        }
        // if the digit initially passed is less than 10, the sum is the digit
        // if the digit has reduced to a num less than 10, return the num
        if(num < 10){
            return num;
        }

        return sumOfDigits(num/10) + sumOfDigits(num % 10);
         */
        if (num == 0){
            return 0;
        }
        return (num % 10) + sumOfDigits(num / 10);
    }

    // iterative method
    static int sum(int num){
        int sum = 0;
        while (num != 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}
