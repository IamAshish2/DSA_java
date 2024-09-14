package Leetcode.Arrrays.Easy;

import java.util.Arrays;

/*
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]]
 for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

Example 2:
Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
 */
// i'm so mad that i wasn't thinking properly
// this took like 20-25 minutes of my time
// oh goddddddd, how was it that i thought ans[nums[nums[i]] would be the index where i'd put
// the values
// i simply had to put the values that came by in the index one after another lol
public class Leetcode1920 {
    public static void main(String[] args) {
        int [] arr = buildArray(new int [] {0,1,2,5,3,4});
        System.out.println(Arrays.toString(arr));
    }

    public static int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
