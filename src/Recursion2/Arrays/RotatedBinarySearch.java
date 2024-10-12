package Recursion2.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,7,0,arr.length-1));
    }

    static int search(int [] arr, int target, int start, int end){

        // we searched the entire array and we didn't find the element
        if(start > end ) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target){
            return mid;
        }
        // the array is sorted in the first half, search there
        if (arr[start] <= arr[mid]){
            if(arr[start] <= target && arr[mid] >= target ){
                return search(arr,target,start,mid-1);
            }else{
                return search(arr,target,mid + 1,end);
            }
        }

        if (arr[mid] <= target && arr[end] >= target){
            return search(arr,target,mid+1,end);
        }
        return  search(arr,target,start,mid-1);

    }
}
