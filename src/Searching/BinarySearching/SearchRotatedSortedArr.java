package BinarySearch;

public class SearchRotatedSortedArr {
    public static void main(String[] args) {
//        int [] nums = {4,5,6,7,0,1,2};
//        int [] nums = {4,5,6,7,0,1,2};
//        int [] nums = {5,1,3};
//        int [] nums = {6,7,1,2,3,4,5};
        int [] nums = {6,7,1,2,3,4,5,6};
//        int [] nums = {2,9,2,2};
        int target = 7;
        System.out.println(findPeak(nums));
        System.out.println(searchRotatedArr(nums,target));
    }

    static  int searchRotatedArr(int [] arr,int target){
        int peakIdx = findPeak(arr);
        if(arr[peakIdx] == target) return peakIdx;
        int firstHalf = binarySearch(arr,target,0,peakIdx);
        if(firstHalf != -1) return  firstHalf;
        return  binarySearch(arr,target,peakIdx+1,arr.length-1);
    }

    static int findPeak(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end-start)/2;
            // if the array is ascending, we know if mid > mid + 1
            // we have found our peak element
            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            /*
             the peak element will be found above, if some cases seem unconventional,probably because
             the peak element was already found and returned.
             */

            // now if we are looking at a array like {3,4,5,2,3,4} where start = 0 , end = 4 , mid = 2
            // now if mid <= start it is safe to assume that all the elements after mid are smaller than
            // start, hence ignore all those elements
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            // likewise if elements at start are less than mid, say {3,4,5,2,3} if mid was 5 and if 3 is start
            // we can ignore the elements till mid since mid is greater and all elements are less than mid element
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPeakWithDuplicates(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end-start)/2;
            // if the array is ascending, we know if mid > mid + 1
            // we have found our peak element
            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            // for the condition when start = mid = end
            if(arr[start] == arr[end] && arr[end] == arr[mid] && arr[start] == arr[mid]){
                if(arr[start] > arr[start+1]){
                    return start;
                }
                // but what if the pivot element is the start or the end???
                start++;
                if(arr[end] < arr[end-1]){
                    return end - 1;
                }
                end--;
            }else if(arr[start] > arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid - 1 ;
            }
        }
        return -1;
    }

    static int binarySearch(int [] arr, int target,int start,int end){
        while (start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }


}
