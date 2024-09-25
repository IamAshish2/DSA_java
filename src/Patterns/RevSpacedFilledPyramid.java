package Patterns;
/*
11.  * * * * *
      * * * *
       * * *
        * *
         *
 */
public class RevSpacedFilledPyramid {
    public static void main(String[] args) {
        reversePyramid(5);
    }

    static void reversePyramid(int n){
        for (int i = 0; i<n;i++){
            // spaces
            for (int s = 0; s<i;s++){
                System.out.print(" ");
            }

            // for stars
            for (int st = n; st> i;st--){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
