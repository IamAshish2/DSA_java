package Leetcode.Arrrays;

import java.util.Arrays;

/* 832. Flipping an Image
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class Leetcode832 {
    public static void main(String[] args) {
//        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][]image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int [] [] result = flipAndInvertImage(image);

        for (int [] rows : result){
            for (int cols : rows){
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    // normal way of thinking solution
    public static int[][] flipAndInvertImage(int[][] image) {
        // reversing the rows first
        for(int [] rows : image){
            int len = rows.length;
          for (int i=0;i<rows.length/2;i++){
              int temp = rows[i];
              rows[i] = rows[len-i-1];
              rows[len-i-1] = temp;
          }
        }

        // inverting the image
        for (int [] rows: image){
            for (int i=0;i<rows.length;i++){
                if(rows[i] == 0){
                    rows[i] = 1;
                }else{
                    rows[i] = 0;
                }
            }
        }
        return image;
    }
/* leetcode top solution using xor operator
    class Solution {
        public int[][] flipAndInvertImage(int[][] image) {
            for(int i = 0; i < image.length; i++){
                for(int j = 0; j < (image[i].length +1)/2 ; j++){
                    //reversing the array and doing XOR 1 to get complement of flipped number.
                    int temp = image[i][j] ^ 1;
                    image[i][j] = image[i][image[0].length-j-1] ^ 1;
                    image[i][image[0].length-j-1] = temp;
                }
            }
            return image;
        }
    }

 */
}
