package Patterns;
/*
18.   **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********

 */
public class HollowSquareWithDiagonals {
    public static void main(String[] args) {
        hallowSquareWithDiagonals(5);
    }

    static void hallowSquareWithDiagonals(int n){
        for (int i=0;i<n;i++){
            // top half left side
            for (int l=n;l>i;l--){
                System.out.print("*");
            }
            int spaces = 2*i;
            // mid spaces
            for (int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            //other half of the left side
            for (int r = n; r>i;r--){
                System.out.print("*");
            }
            System.out.println();
        }

        // the bottom half
        for (int i=0;i<n;i++){
            // left side of the traingle
            for (int l = 0;l<=i;l++){
                System.out.print("*");
            }
            //for spaces in the middle
            int spaces =(n-i)*2-1;
            for (int s=1;s<spaces;s++){
                if(i == n-1){
                    break;
                }
                System.out.print(" ");
            }
            // right side of the lower half
            for (int r=0;r<=i;r++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
