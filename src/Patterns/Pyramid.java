package Patterns;
/*

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Pyramid {
    public static void main(String[] args) {
        HalfWingOfButterfly(5);
    }

    static void HalfWingOfButterfly(int n){
        // goes till 8
        for (int row = 0; row < 2 * n;row++){
            int totalCols = row < n ? row : 2 * n - row;
            for (int col = 0; col < totalCols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
