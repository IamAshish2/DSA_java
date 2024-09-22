package Leetcode.Sorting;

import java.util.Arrays;

/* leetcode 645 Set Mismatch
You have a set of integers s, which originally contains all the numbers from 1 to n.
Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
 which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]
 */
public class SetMismatch {
    public static void main(String[] args) {
         int [] arr = {1,2,2,4};
         int [] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] arr) {
//        int [] ans = new int [2];
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1 ;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

        //   Find the number that occurs twice and the number that is missing
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j + 1){
//                ans[0] = arr[j]; // the number that is repeated twice
//                ans[1] = j+1; // the number that is missing
//                break;
                return new int [] {arr[j],j+1};
            }
        }
        return new int[] {};
    }
    public  static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
