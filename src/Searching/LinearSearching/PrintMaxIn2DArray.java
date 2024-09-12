package Searching.LinearSearching;

import java.util.Arrays;

public class PrintMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int [][] {
                {12,13,14,15},
                {11},
                {154,189,111,989,89}
        };

        int result = printMax(arr);
        System.out.println("The minimum value in the arr is " + result);
    }

    static int printMax(int [][] arr){
        int max = Integer.MIN_VALUE;

        for(int [] rows : arr){
            for (int ele: rows){
                if(ele > max){
                    max = ele;
                }
            }
        }
        return max;
        /*
        for (int i=0;i<arr.length;i++){
            int cols = arr[i].length;
            for (int j=0;j<cols;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        return  max;
         */
    }
}
