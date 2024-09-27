package Patterns;

import com.sun.security.jgss.GSSUtil;

/*
    15.  *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
 */
public class FullHallowDiamond {
    public static void main(String[] args) {
        fullHallowDiamond(5);
    }

    static void fullHallowDiamond(int n) {
        int iterate = 2 * n - 1;
        for (int row = 0; row < iterate; row ++){

            int space = row < 5 ? n - row :  row + n - iterate;
            // print the leading spaces
            for (int s = 0; s < space;s++){
                System.out.print(" ");
            }

            int rowStar = row < 5 ? 2 * row + 1 : 2 * (iterate - row);
            for (int star = 0; star < rowStar;star++){
                if(star == 0 || star == rowStar - 1 && row != iterate -1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
