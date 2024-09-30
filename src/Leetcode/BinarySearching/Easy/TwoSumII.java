package Leetcode.BinarySearching.Easy;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }

    static int [] twoSum(int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int total = arr[start] + arr[end];
            if(total == target){
                return new int[] {start+1,end+1};
            }
            if(total < target){
                start++;
            }else{
                end--;
            }
        }
        return new int[] {};
    }
}
