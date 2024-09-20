package Misc;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
//        int [] arr = {1,2,3,4,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void selection(int [] arr){
        for (int i = 0;i<arr.length;i++){
            int min = i;
            boolean sorted = true;
            for (int j=arr.length-1;j>=i;j--){
                if(arr[j] < arr[min]){
                    min = j;
                    sorted = false;
                }

            }
            if(sorted){
                return;
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void selectionMax(int [] arr){
        for (int i = 0;i<arr.length;i++){
            int max = i;
            boolean sorted = true;
            for (int j=arr.length-1;j>=i;j--){
                if(arr[j] > arr[max]){
                    max = j;
                    sorted = false;
                }

            }
            if(sorted){
                return;
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

}
