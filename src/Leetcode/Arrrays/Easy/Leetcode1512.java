package Leetcode.Arrrays.Easy;
/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */
public class Leetcode1512 {
    public static void main(String[] args) {
        int []nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i] == nums[j] && i<j){
                    pairs++;
                }
            }
        }
        return pairs;
    }

}
