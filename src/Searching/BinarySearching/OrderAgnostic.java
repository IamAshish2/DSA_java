package Searching.BinarySearching;

public class OrderAgnostic {
    public static void main(String[] args) {
        int [] arrAsc = {12,13,18,28,42,98,101};
        int [] arrDesc = {101,98,42,28,18,13,12};
        int ascTarget = 12;
        int descTarget = 98;
        System.out.println(binarySearch(arrAsc,ascTarget));
        System.out.println(binarySearch(arrDesc,descTarget));
    }
    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if (isAscending){
                if (arr[mid] < target){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }else{
                if(arr[mid] < target){
                  end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return  -1;
    }
}
