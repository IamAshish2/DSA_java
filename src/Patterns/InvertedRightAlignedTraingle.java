package Patterns;
/*
 *****
  ****
   ***
    **
     *

 */
public class InvertedRightAlignedTraingle {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n){
        for (int rows = 0; rows<n;rows++){

            int cols = n - rows;
            // print spaces
            for (int spaces=0;spaces<rows;spaces++){
                System.out.print(" ");
            }
            // print stars
            for (int j = 0; j<cols;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
