package Patterns;
/*
14.  *********
      *     *
       *   *
        * *
         *
 */
public class InverseHollowDiamond {
    public static void main(String[] args) {
        inverseHollowTriangle(5);
    }

    static void inverseHollowTriangle(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            // Print stars and spaces in between
            int rowStar = 2 * (n - i) - 1;
            for (int stars = 0; stars < rowStar; stars++) {
                // Print star at start and end, or at first row
                if (stars == 0 || stars == rowStar - 1 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
