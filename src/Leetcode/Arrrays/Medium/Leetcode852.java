package Leetcode.Arrrays.Medium;
/* 852. Peak index in Mountain array

You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1
 */
public class Leetcode852 {
    public static void main(String[] args) {
        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(peakIndexInMountainArray(arr));
    }

    // log(n) solution : runs in 0ms time
    // determine the greatest element i.e. our target from the array
    public static int peakIndexInMountainArray(int[] arr) {
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

    /* this was my first approach. i didn't even need to use binarySearch function though. i could just return start and get
    the index. but the time complexity was not good. it ran at nlog(n). which i have optimised to log(n) in the above example.
     determine the greatest element i.e. our target from the array

    public static int peakIndexInMountainArray(int[] arr) {
        int end = 1;
        int target = arr[0];
        // find the index of start of the element's increasing order and the peak of the mountain value
        while (target < arr[end]) {
            target = arr[end];
            end++;
        }
        int start = end - 1 ;
        return start;
        return binarySearch(arr,target, start);
    }

    public int binarySearch(int[] arr, int target,int start) {
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if ( target < arr[mid]) {
                start = mid + 1;
            } else if(target > arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
     */
}
