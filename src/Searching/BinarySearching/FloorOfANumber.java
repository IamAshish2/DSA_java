package BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        System.out.println(floor(arr,2));
    }

    static int floor(int [] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] == target) return arr[start];
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return arr[mid - 1];
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
