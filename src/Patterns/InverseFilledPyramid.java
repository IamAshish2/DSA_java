package Patterns;
/*
    9.  *********
         *******
          *****
           ***
            *
*/
public class InverseFilledPyramid {
    public static void main(String[] args) {
        printPyramid(5);
    }

    static void printPyramid(int n){
        for (int i=0;i<n;i++){
//            for spaces
            for (int s = 0; s < i; s++){
                System.out.print(" ");
            }

            // for stars
            int stars = 2 * n - 2 * i;
            for (int s = 1; s < stars;s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
