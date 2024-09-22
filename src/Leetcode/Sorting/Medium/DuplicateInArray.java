package Leetcode.Sorting.Medium;
import java.util.ArrayList;
import java.util.List;
/* Leetcode 442 find the duplicate elements in a array in 0(n)
Given an integer array nums of length n where all the integers of nums are in the range [1, n]
 and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space,
excluding the space needed to store the output

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example 2:
Input: nums = [1,1,2]
Output: [1]

Example 3:
Input: nums = [1]
Output: []
 */
public class DuplicateInArray {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
//        int [] nums = {};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        // basic cyclic sort
        List<Integer> dups = new ArrayList<Integer>();
        if(nums.length == 0) return dups;

        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        // search for the duplicate elements
        for(int j=0;j<nums.length;j++){
            if(j + 1 != nums[j]){
                dups.add(nums[j]);
            }
        }
        return dups;
    }


    public static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
