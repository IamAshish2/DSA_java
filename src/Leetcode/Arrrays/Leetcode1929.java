package Leetcode.Arrrays;
//1929. Concatenation of Array

//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i]
//and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.

public class Leetcode1929 {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int [] arr = getConcatenation(nums);
        for(int ele: arr){
            System.out.println(ele);
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int [] ans = new int[len + len];
        int j=0;
        int left = ans.length / 2;

        int right = left;
//        int
        while (j != left){
            ans[j] = nums[j];
            ans[right] = nums[j];
            j++;
            right++;
        }

        return ans;
    }
}
