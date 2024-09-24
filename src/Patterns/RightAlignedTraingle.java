package Patterns;
/*

       *
      **
     ***
    ****
   *****

 */
public class RightAlignedTraingle {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n){
        for (int i=0;i<n;i++){

            for (int j = n-1;j>i;j--) {
                System.out.print(" ");
            }

            for (int k = 0; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
