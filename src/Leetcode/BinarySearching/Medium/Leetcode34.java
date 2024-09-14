package Leetcode.BinarySearching.Medium;

import java.util.Arrays;

/* 34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

 */
public class Leetcode34 {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 7;
        int [] result = searchRange(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {
        int [] targetIndex = {-1,-1};

        int firstIndex = searchNumber(nums,target,true);
        //  if first index == -1 , meaning the target is not present in the array, return {-1,-1}
        if (firstIndex == -1){
            return targetIndex;
        }
        int secondIndex = searchNumber(nums,target,false);
        targetIndex[0] = firstIndex;
        targetIndex[1] = secondIndex;
        return targetIndex;
    }

    // function to search for the number in leftside or rightside of the array according to boolean value of isSearchFirstIndex parameter
    public  static int searchNumber(int [] nums,int target,boolean isSearchFirstIndex){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            // only thing more than the binary search is we are checking if we have another element
            // in the array that matches our target even after target is found
            // [5,7,7,8,8,10] say in this array we found 7 at index 2 first, but it is only a possible
            // first index for target = 7. so we keep looking at leftside to see if there is any other element==target
            // hence the , end = mid -1 for searching a element in the left side

             if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }  else if(target == nums[mid]) {
                ans = mid;
                if(isSearchFirstIndex){
                    end = mid -1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
