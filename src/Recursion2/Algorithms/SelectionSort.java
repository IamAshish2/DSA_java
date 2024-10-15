package Recursion2.Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        selectionSort(arr,0,1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int [] arr,int max,int start,int end){
        if (end == 0){
            return;
        }

        if (start <= end){
            // Update max if the current element is larger
            if (arr[max] < arr[start]) {
                max = start;
            }
            // Continue searching in the subarray
            selectionSort(arr, max, start + 1, end);
        }else{
            swap(arr,max,end);
            selectionSort(arr,0,1,end-1);
        }
    }


    private static void swap(int[] arr, int curr, int next) {
        int temp = arr[curr];
        arr[curr] = arr[next];
        arr[next] = temp;
    }
}
