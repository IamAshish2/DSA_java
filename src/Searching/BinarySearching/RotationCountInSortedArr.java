package Searching.BinarySearching;
// basically find the index of pivot element and add 1
public class RotationCountInSortedArr {
    public static void main(String[] args) {
//        int [] arr = {15,18,2,3,6,12};
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));
    }

    static int countRotation(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(start < end && arr[start] > arr[start+1]){
                return start + 1;
            } else if(end > start && arr[end] > arr[start]){
                return end + 1;
            }

            if(mid < end && arr[mid] > arr[mid+1]){
                start = mid;
            }else if(mid > start && arr[mid] < arr[mid-1]){
                end = mid-1;
            }
        }
        return start;
    }
}
