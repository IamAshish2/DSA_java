package BinarySearch;
// peak index in a mountain array
public class MountainPeak {
    public static void main(String[] args) {
        int [] nums = {3,5,7,9,10,90,110,130,140,160};
        System.out.println(findPeak(nums));
    }

    static int findPeak(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) /2;
            if(mid < end && arr[mid] > arr[mid+1]){
                end = mid;
            }else if(mid < end && arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }
        }
        return end;
    }
}
