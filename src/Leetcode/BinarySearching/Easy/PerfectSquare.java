package Leetcode.BinarySearching.Easy;

public class Leetcode367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        if (num == 1) return true;
        int start = 1;
        int end = num;
        while(start <= end){
            int mid = start + (end-start) / 2;
            int square = mid * mid;
            if(square == num){
                return true;
            } else if(square > num){
                end = mid-1;
            }else start = mid + 1;
        }
        return false;
    }
}
