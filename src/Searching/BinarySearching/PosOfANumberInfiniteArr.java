package BinarySearch;

public class PosOfANumberInfiniteArr {
    public static void main(String[] args) {
        int [] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println(findPosition(arr,9));
    }

    static int findPosition(int [] arr,int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end + 1;
            end = start + (end - start + 1) * 2; // this calculates the end value considering the range
//            end *= 2; this just doubles the size up
            start = temp;
        }
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
