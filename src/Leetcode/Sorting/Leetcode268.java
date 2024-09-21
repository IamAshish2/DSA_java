package Leetcode.Sorting;
/* leetcode 268 missing number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 */
public class Leetcode268 {
    public static void main(String[] args) {
        int [] arr = {0,3,1};
        System.out.println(missingNumber(arr));
    }

    // here index of the correct number startss from 0:
    // the array contains nums till n i.e. arr.length
    public static int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }

        // look for the missing index
        for(int index = 0;index<arr.length;index++){
            if(index != arr[index]){
                return index;
            }
        }
        return arr.length;
    }
}
