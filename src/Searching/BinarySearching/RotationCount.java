package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int [] arr = {15,18,2,3,6,8,12};
        System.out.println(rotationCount(arr) + 1);
    }

    // returns the index of the peak element
    static int rotationCount(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                return mid;
            }else if (arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            // {4,5,6,2,3,4} say we have start = 4, end = 5 and mid = 2, it is safe to ignore the rest of the
            // part of right hand side after mid, so we ignore them and end = mid - 1
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
