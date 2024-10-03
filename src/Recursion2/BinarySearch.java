package Recursion2;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,90,99,999};
        System.out.println(recursiveBinarySearch(arr,0,arr.length-1,99));
    }

    static int recursiveBinarySearch(int [] arr, int start, int end, int target){
        int mid = start + (end - start) / 2;
        if(start > end) return -1;
        if(arr[mid] == target){
            return mid;
        }
        // if target is less than element at arr[mid], check the left hand side
        if(arr[mid] > target){
           return recursiveBinarySearch(arr,start,mid-1,target);
        }

        // if target is greater than arr[mid] , check the right hand side
        return recursiveBinarySearch(arr,mid+1,end,target);
    }
}
