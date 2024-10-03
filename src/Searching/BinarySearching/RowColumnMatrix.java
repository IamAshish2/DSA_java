package Searching.BinarySearching;

import java.util.Arrays;

public class RowColumnMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{10,20,30,40},{15,25,35,45,},{28,29,37,49},{33,34,38,50}};
        int [] result = binarySearch(matrix,50);
        System.out.println(Arrays.toString(result));
    }

    static int[] binarySearch(int [][] matrix,int target){
        int row = 0;
        int col = matrix[1].length -1 ;
        while(row < matrix.length && col >= 0){
            if(target == matrix[row][col]){
                return new int [] {row,col};
            }else if(target < matrix[row][col]){
                col--;
            }else if(target > matrix[row][col]){
                row++;
            }
        }
        return new int [] {-1,-1};
    }
}
