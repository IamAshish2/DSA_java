package Recursion.RecursionBeginner;
// Write a Java recursive method to find the sum of all odd numbers in an array.
public class SumOfOdd {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(calcSum(arr,0,0));
    }

    static int calcSum(int [] arr,int idx,int sum){
        if(idx == arr.length){
            return sum;
        }
        if(arr[idx] % 2 != 0){
            sum += arr[idx];
        }
        return calcSum(arr,idx + 1,sum);
    }
}
