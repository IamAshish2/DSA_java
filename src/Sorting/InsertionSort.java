package Sorting;

import java.util.Arrays;

class InsertionSort{
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int [] arr){
        for (int i=0;i<arr.length - 1 ;i++){ // <= arr.length -2 // same thing
            for (int j=i+1;j>0;j--){
                // while j not smaller than j -1 : current element is greater than previous element

                // ascending order
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break; // if(!(arr[j] < arr[j-1])) break;
                }

            }
        }
    }
}