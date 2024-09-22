package Leetcode.Sorting;

import java.io.FilterOutputStream;

/* Leetcode 287 find the duplicate number
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3

Example 3:
Input: nums = [3,3,3,3,3]
Output: 3
 */
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int [] arr = {1,4,3,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length){
            // arr is given [1,N], so the correct index lies in : value - 1
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx]){
                swap(arr,i,correctIdx);
            }// check for duplicate and don't check if the current index == correct index
            // eg: {1,4,3,2,2} i = 0 and correct index = 0
            // we donot want to flag duplicate when i and correct index are same
            else if(i != correctIdx && arr[i] == arr[correctIdx]){
                return arr[i];
            } else{
                i++;
            }
        }
        return -1;
    }
    public static void swap(int [] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
