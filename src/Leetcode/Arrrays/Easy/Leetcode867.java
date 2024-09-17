package Leetcode.Arrrays.Easy;
/* Transpose of a matrix
Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 */
public class Leetcode867 {
        public int[][] transpose(int[][] arr) {
            int rows = arr.length;
            int  cols = arr[0].length;
            int [][] newArr = new int[cols][rows];

            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    newArr[j][i] = arr[i][j];
                }
            }
            return newArr;
        }
}