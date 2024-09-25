package Patterns;
/*

         *
        * *
       * * *
      * * * *
     * * * * *
 */
public class SpacedFilledPyramid {
    public static void main(String[] args) {
            hollowPyramid(5);
    }

    static  void hollowPyramid(int n){
        for (int i=0;i<n;i++){
            // spaces print
            for (int s=i;s<n;s++){
                System.out.print(" ");
            }

            // stars print
            for (int star = 0 ;star <= i; star ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
