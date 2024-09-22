package Leetcode.Sorting;
import java.util.ArrayList;
/* 448. Find All Numbers Disappeared in an Array
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the
integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]
 */

public class FindNumbersDisappered {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> notNums = new ArrayList<Integer>();
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            } else{
                i++;
            }
        }

        // check for elements not present in the nums arr
         for(int j = 0;j<arr.length;j++){
             if(arr[j] != j+1){
                 notNums.add(j+1);
             }
         }
        return notNums;
    }

    public  static void swap(int [] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
