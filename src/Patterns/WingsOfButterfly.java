package Patterns;
/*
19.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *
 */
public class WingsOfButterfly {
    public static void main(String[] args) {
        wingsOfButterFly(5);
    }

    static void wingsOfButterFly(int n){
        // upper half
        for (int i=0;i<n;i++){
            // left side wings
            wingsUpperHalf(i);
            // middle spaces
            int spaces = (n-i) * 2-1;
            for (int s=1;s<spaces;s++){
                System.out.print(" ");
            }
            // right side of the upper half
            wingsUpperHalf(i);
            System.out.println();
        }

        // lower half
        for (int i=n-1;i>0;i--){
            // left half of lower wings
           wingsLowerHalf(i);
            // middle spaces
            int spaces = (n-i) * 2;
            for (int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            wingsLowerHalf(i);
            System.out.println();
        }
    }

    static void wingsLowerHalf(int i){
        for (int l=i;l>0;l--){
            System.out.print("*");
        }
    }

    static void wingsUpperHalf(int i){
        // left side of the upper half
        for (int l=0;l<=i;l++){
            System.out.print("*");
        }
    }
}
