package Patterns;
/*
    13.  *
        * *
       *   *
      *     *
     *********
 */
public class HollowDiamond {
    public static void main(String[] args) {
        printHollowDiamond(5);
    }

    static void printHollowDiamond(int n){
        for (int row= 0; row<n;row++){
            // printing space
            for (int space = 0; space < n - row - 1; space++){
                System.out.print(" ");
            }

            for (int star = 0; star <= row; star++){
                if(star == 0 || star == row || row == n-1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}
