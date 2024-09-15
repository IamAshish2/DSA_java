package Leetcode.Arrrays.Medium;
// same as 33 but there are repitiion in numbers
public class Leetcode33_repitition {
    public static void main(String[] args) {
//        int [] arr = {4,5,5,6,6,7,0,1,2,5,6};
//        int [] arr = {5,5,1,3,3};
//        int [] arr = {1};
//        int [] arr = {3,1};
//        int [] arr = {8,9,2,3,4};
//        int [] arr = {3,5,1};
//        int [] arr = {2,9,2,2,2};
        int [] arr = {9,10,12,6,7,8};
        int target = 8;
        System.out.println(findPeakWithDuplicates(arr));
        int index = search(arr,target);
        System.out.println(index);
    }


    // this find method : seems to be working but has a flaw ;
    // when ele at start =ele at  mid = ele at end , it is not checking properly
    static int findPeak(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            // case 1
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            // case 2
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            // case 3 : this test case will fail when dealing with duplicate numbers, because at one point
            // the s,e and m all will be same.
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPeakWithDuplicates(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            // case 1
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            // case 2
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }

            // if start,middle and end are equal , then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip duplicates
                // NOTE : what if these items that we skipped were the peak element
//                check if start is pivot
                if(arr[start] > arr[start + 1]){
                        return start;
                }
                start++;
//                check if end is pivot/peak
                if(arr[end] < arr[end-1]){
                    return end - 1;
                }
                end--;
            } // left side is sorted , so pivot is on the right side
           else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            } // if above condition is found false, the pivot is on the left side
           else{
               end = mid - 1;
            }

        }
        return -1;
    }

    static int search(int[] arr,int target){
        int peak = findPeak(arr);

        if(peak == -1){
            return binarySearch(arr,target,0,arr.length);
        }

        int leftSide = binarySearch(arr,0,peak,target);
        int rightSide = binarySearch(arr,peak+1, arr.length-1,target);

        if(leftSide != -1){
            return leftSide;
        } else return rightSide;
    }


    // binary search for ascending order because we know the array is ascending sorted
//     it is only rotated but is ascending
    public static int binarySearch(int [] arr, int start,int end,int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                end = mid;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }
}
