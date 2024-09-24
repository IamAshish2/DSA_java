package Patterns;
/*
         *
        ***
       *****
      *******
     *********
 */
public class PyramidOddNumStarts {
    public static void main(String[] args) {
        oddStarPyramid(5);
    }

    static void oddStarPyramid(int n){
        for (int i=1;i<=n;i++){
//            int spaces = n - i;
            int cols = 2 * i - 1;
            // spaces print
            for (int j = i; j<n;j++){
                System.out.print(" ");
            }
            // star print
            for (int s = 1;s<=cols;s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
