package Leetcode.BinarySearching.Medium;

/* Find position of an element in a sorted array of infinite numbers
    link-> https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
Source: Amazon Interview Experience.
Since array is sorted, the first thing clicks into mind is binary search,
but the problem here is that we don’t know size of array.
If the array is infinite, that means we don’t have proper bounds to apply binary search.
So in order to find position of key, first we find bounds and then apply binary search algorithm.
Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
->if it is greater than high index element then copy high index in low index and double the high index.
->if it is smaller, then apply binary search on high and low indices found.
 */

public class PosOfElementInfiniteArr {
    public static void main(String[] args) {
    int [] arr =new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
    int target = 10;
    System.out.println(ans(arr,target));
    }

    static int ans(int [] arr,int target){
        // first find the range
        // first start with a box of 2
        int start = 0;
        int end = 1;
        // we double the size of our array until we find a range start->end that contains our target
        while (target > arr[end]){
            int temp = end + 1; // keeping the initial end value + 1 , so we can assign our next start index for range
            // doubling our array range size
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        // simple binary search result return value
        return  binarySearch(arr,target,start,end);
    }

    static int binarySearch(int [] arr, int target,int start,int end){
        while (start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
