package Recursion2.Algorithms;
import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        bubbleSort(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int [] arr,int start,int end){
        if (end == 0){
            return;
        }
        if (start < end){
            if (arr[start] > arr[start+1]){
                swap(arr,start,start+1);
                bubbleSort(arr,start+1,end);
            }
        }else{
            bubbleSort(arr,0,end-1);
        }

    }

    private static void swap(int[] arr, int curr, int next) {
        int temp = arr[curr];
        arr[curr] = arr[next];
        arr[next] = temp;
    }
}
