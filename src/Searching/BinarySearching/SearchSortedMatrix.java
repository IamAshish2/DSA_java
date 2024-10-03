package Searching.BinarySearching;

import java.util.Arrays;

public class SearchSortedMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int [] result = searchSorted(matrix,16);
        System.out.println(Arrays.toString(result));
    }

    static int[] searchSorted(int [][] matrix,int target){
        int row = 0;
        int col = matrix[1].length-1;
        while (row < matrix.length && col >= 0){
            if(target == matrix[row][col]){
                return  new int[] {row,col};
            }else if(target > matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return  new int[] {-1,-1};
    }
}
