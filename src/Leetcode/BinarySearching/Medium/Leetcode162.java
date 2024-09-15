package Leetcode.BinarySearching.Medium;
/* 162 find an peak element
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index.
If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞.
In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
 */
public class Leetcode162 {
    public static void main(String[] args) {
        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] arr) {
        // initialize start 0  and end to be length -1
        int start = 0;
        int end = arr.length - 1;
        // implement binary search to find the peak of the mountain

        // start != end :: start == end , both point to the peak of our array

        while(start < end){ //  only done start < end because when start and end are equal we have found the peak
            // move the check to either leftwards or rightwards side based on if else condition
            int mid = (start + end ) / 2;
            // if current mid value > mid + 1 , move the search to left side
            if(arr[mid] > arr[mid+1]){
                // you are in the decreasing part of the array
                // this is a possible answer,
                // we look at left side to be sure
                end = mid;
            } // else move search to right side
            else if(arr[mid] < arr[mid+1]){
                // you are in the increasing part of the array
                // if this condition is true,then we can move start to mid+1
                // as mid+1 is clearly greater than start, also we move up the mountain.
                start = mid + 1;
            }
        }
        // after the loop, the start and end are both going to be pointing to the same element
        // i.e. the peak of our mountain
        // start and end are always trying to find the largest number because of the 2 checks
        // hence, when they are pointing to the same element,we know we got the largest element

        // in every iteration, the start and the end index, have the best possible answer till that time,
        // and when we say, we have only one element remaining, that is our peak/largest element of the array
        return end;
    }
}
