package Leetcode.Sorting.Hard;
/* Leetcode 41 find missing positive
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 */
public class FindMissingPositive {
    public static void main(String[] args) {
        int [] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        // sort the array using cyclic sort
        while(i < arr.length){
            // do not check for values in the array that is greater than length and values less than 1
            // ignore 0 and negative nums
            if(arr[i] > arr.length || arr[i] <= 0){
                i++;
                continue;
            }

            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

        // find the missing positive
        // start from 1 and return any number that is missing at it's correct index
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                return j + 1;
            }
        }
        // return n + 1 element if we have 1 till N {1,2,3,4,5}
        // the smallest missing number here is 6
        return arr.length + 1;
    }
    public static  void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
