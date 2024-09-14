package Searching.BinarySearching;

public class BinarySearchAsc {
    public static void main(String[] args) {
        int [] arr = {12,13,18,28,42,98,101};
        int target = 101;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length -1;
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
