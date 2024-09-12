package Searching.LinearSearching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int [][] {
                {12,13,14,15},
                {11},
                {154,189,111,989,89}
        };

        int[] result = searchArr(arr,89);
        System.out.println(Arrays.toString(result));
    }

    static int[] searchArr(int [][] arr,int target){
        if(arr.length == 0){
            return new int [] {-1,-1};
        }

        int rows = arr.length;

        for (int i=0;i<rows;i++){
            int cols = arr[i].length;
            for (int j=0;j<cols;j++){
                if(arr[i][j] == target){
                    return new int [] {i,j};
                }
            }
        }

        return  new int[] {-1,-1};
    }
}
