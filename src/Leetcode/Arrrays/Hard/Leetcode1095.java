package Leetcode.Arrrays.Hard;

public class Leetcode1095 {
    public static void main(String[] args) {
//    int target = 3;
//    int [] arr = {1,2,3,4,5,3,1};
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,
                16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
                31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,
                46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
                61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,
                77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,
                93,94,95,96,97,98,99,100,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82};

        System.out.println(findInMountainArray(1,arr));
    }

    public static int findInMountainArray(int target, int [] mountainArr) {
        // target == mountain.get(index)
        // check if the mountain array is less than 3, if it is than it is not a mountain array
        if(mountainArr.length < 3){
            return -1;
        }
        int end = peakIndexInMountainArray(mountainArr);
        int leftSide = binarySearch(target,mountainArr,0,end,true);
        if(leftSide != -1){
            return leftSide;
        }

        return binarySearch(target,mountainArr,end,mountainArr.length,false);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        // initialize start 0  and end to be length -1
        int start = 0;
        int end = arr.length - 1;
        // find the peak's index and return it
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }

    public static int binarySearch(int target, int [] mountainArr,int start,int end,boolean isAscending){
        while(start < end){
            int mid = start + (end - start) /2;
            if(mountainArr[mid] == target){
                return mid;
            }

            if(isAscending){
                if(target < mountainArr[mid]){
                    end = mid -1;
                } else if(target > mountainArr[mid]){
                    start = mid + 1;
                }
            }else{
                if(target < mountainArr[mid]){
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }
        }

        return -1;
    }


}