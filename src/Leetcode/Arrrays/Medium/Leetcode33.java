package Leetcode.Arrrays.Medium;
/* 33. Search in Rotated Sorted Array
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
 such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity
Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1
 */
public class Leetcode33 {
    public static void main(String[] args) {
//        int [] arr = {4,5,6,7,0,1,2};
//        int [] arr = {5,1,3};
//        int [] arr = {1};
//        int [] arr = {3,1};
//        int [] arr = {8,9,2,3,4};
        int [] arr = {3,5,1};
        int target = 3;
//        System.out.println(findPivot(arr));
        int ans = search(arr,target);
        System.out.println(ans);
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if mid element is greater than mid+1 element, we have found the pivot element
            // because mid is > mid+1 element only at one point in the rotated array i.e. the point
            // where our pivot element is found
             if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            } // if mid element is less than mid -1 element, then it is safe to say that the pivot element lies in the
            // right side of the array
             if( mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }
            // if start element is greater than mid element, it is also safe to say that the right side of mid element does not
            // contain our pivot element,so end becomes mid -1
             if(nums[mid] <= nums[start] ){
                end = mid -1;
            }// if mid element > start element , we can be sure that the pivot element lies in the right side as the array is sorted
            // in asceding order.
            // we can be sure that a greater number is on the right side because of our first check
            else { //if(nums[mid] > nums[start])
                start = mid + 1;
            }
        }

        return -1; // No pivot found
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums); // index of the peak array

        // the array is not rotated properly, run normal binary search
        if(pivot  == -1){
            return binarySearch(nums,0,nums.length -1 ,target);
        }

        // limiting the search range
        // case 1 : if pivot element is the target return pivot index
        if(nums[pivot] == target){
            return pivot;
        } //  if the target is greater than the first element meaning that it is smaller than pivot, then we know the target lies
        // in  the first half of our array so, we search till pivot index -1
        else if(target >= nums[0]){
            return binarySearch(nums,0,pivot -1,target);
        }
        // if target is less than first element, we know the target lies in the second half of the pivot element
        // so we search from pivot index + 1 till end
        return  binarySearch(nums,pivot + 1,nums.length -1 ,target);
    }

    // binary search for ascending order because we know the array is ascending sorted
    // it is only rotated but is ascending
    public static int binarySearch(int [] arr, int start,int end,int target){
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
