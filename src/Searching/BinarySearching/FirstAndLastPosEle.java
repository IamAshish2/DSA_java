package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosEle {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int [] result = searchRange(arr,8);
        System.out.println(Arrays.toString(result));
    }

    public static   int[] searchRange(int[] nums, int target) {
        int firstIdx = findIndex(nums,target,true);
        if(firstIdx == -1) return  new int[] {-1,-1};
        int secondIdx = findIndex(nums,target,false);
        return  new int[] {firstIdx,secondIdx};
    }

    public static int findIndex(int [] arr,int target,boolean isSearchFirstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end -start)/2;
            if(arr[mid] == target) {
                ans = mid;
                if(isSearchFirstIndex){
                    end=mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else if(arr[mid] > target){
                    end = mid - 1;
            }else if(arr[mid] < target){
                    start = mid + 1;
            }
        }
        return ans;
    }
}
