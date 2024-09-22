package Searching.BinarySearching;
// basically find the index of pivot element and add 1
// make it better
public class RotationCountInSortedArr {
    public static void main(String[] args) {
//        int [] arr = {15,18,2,3,6,12};
//        int [] arr = {4,5,6,7,0,1,2};
//        int [] arr = {1,2,3,4,5};
        int [] arr = {4,5,0,1};
        System.out.println(findPivot(arr));
    }

    /*
    static int countRotation(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // get middle element for every iteration
            int mid = start + (end - start) / 2;

            // when element at start is greater than start + 1, it means the element at start is greatest element
            // because we are initially given a sorted array and there can only be one condition where start > start + 1
            if(start < end && arr[start] > arr[start+1]){
                return start + 1;
                // same thing here
            } else if(end > start && arr[end] > arr[start]){
                return end + 1;
            }

            if(mid < end && arr[mid] > arr[mid+1]){
                start = mid;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                end = mid-1;
            }
        }
        return -1;
    }
     */

    // better solution
    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            // find the peak/pivot element in the array and return it's index + 1
            // to find the rotation count in sorted array
            if(mid < end && arr[mid] > arr[mid+1]){
                return  mid + 1;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                end = mid -1 ;
            }
            else if (mid < end && arr[mid] < arr[mid+1]){
                start++;
            }

        }
        return -1;
    }
}
