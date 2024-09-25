package Patterns;
/*
    12.  * * * * *
          * * * *
           * * *
            * *
             *
             *
            * *
           * * *
          * * * *
         * * * * *
 */
public class HourGlass {
    public static void main(String[] args) {
        printHourGlass(5);
    }

    static void printHourGlass(int n){
        for (int row = 0; row < 2 * n; row++){
            // for spaces printing for each level
            int rowSpace = row > 4 ? 2 * n - row - 1: row;
            for (int space = 0; space < rowSpace; space++){
                System.out.print(" ");
            }
            // for stars printing
            int rowStar = row < 5 ? n - row : row + 1 - n;
            for(int star = 0 ; star < rowStar; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
