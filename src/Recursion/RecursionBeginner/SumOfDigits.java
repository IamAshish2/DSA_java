package Recursion.RecursionBeginner;
//4. Write a Java recursive method to find the sum of the digits of a given integer.
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(787,0));
        System.out.println(sum(111));
    }

    static  int sum(int num,int sum){
        if(num < 10){
            return num;
        }
        if(num == 0){
            return sum;
        }
        sum +=  num % 10;
        num /= 10;
        return sum(num,sum);
    }

    static  int sum(int num){
        if(num < 10) return  num; // base case: return the num itself if less than 10

        int lastDigit = num % 10;
        num /= 10;
        return lastDigit + sum(num);
    }
}
