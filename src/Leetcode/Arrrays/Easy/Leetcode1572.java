package Leetcode.Arrrays.Easy;
/* leetcode : 1572 matrix diagonal sum
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
    Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8
 */
public class Leetcode1572 {
    class Solution {
        public int diagonalSum(int[][] mat) {
            // return leftdiagonalSum(mat) + rightdiagonalSum(mat);
            int leftSum = 0;
            int rightSum = 0;
            int rows = mat.length;
            int cols = mat[0].length;

            // for leftsum
            for(int i=0;i<rows;i++){
                leftSum += mat[i][i]; // simple left side diagonal sum as we just have to do 0,0 0,1 0,2 ...
            }

            // for rightSum
            for(int i=0;i<rows;i++){
                int j = cols - 1 - i;  // for every iteration matches what we are looking for
                // for 0,2 (cols=3) j=3-1-0 = 2
                // for 1,1(cols=3) j=3-1-1 = 1 and i ,j should not match here as we have already calculated it's value in left diagonal sum
                // for 2,0 (cols=3) j = 3-1-2 = 0
                if(i != j && i>=0) rightSum += mat[i][j];
            }
            return leftSum + rightSum;
        }
    }
}
