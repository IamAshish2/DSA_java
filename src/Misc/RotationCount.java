package Misc;

public class RotationCount {
    public static void main(String[] args) {
        int [] binary = {1,2,3,4,5};
//        System.out.println(binarySearch(binary,3));
        int [] nums =  {15, 18, 2, 3, 6, 12};
        System.out.println(pivotElement(nums));


    }

    static int pivotElement(int [] nums){
        int start = 0;
        int end = nums.length - 1;

        if(nums[start] < nums[end]) return -1;

        while (start <= end){
            int mid = start + ( end - start) / 2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }

            if(mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }

            if(nums[mid] >= nums[start]){
                start = mid;
            }else if(nums[mid] < nums[end]){
                end = mid -1 ;
            }
        }
        return -1;
    }


    static int binarySearch(int [] arr,int target){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
             int mid = s + (e - s ) / 2;
             if(arr[mid] == target) return mid;
             if(arr[mid] > target){
                 e = mid - 1;
             }else if(arr[mid] < target){
                 s = mid + 1;
             }
        }
        return -1;

    }
}
