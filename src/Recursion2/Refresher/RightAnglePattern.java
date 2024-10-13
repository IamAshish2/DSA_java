package Recursion2.Refresher;

public class RightAnglePattern {
    public static void main(String[] args) {
        printTraingle(4,1);
    }

    static void printTraingle(int row,int col){

        if (row == 0){
            return;
        }
        if (col <= row){
            System.out.print("* ");
            printTraingle(row,col+1);
        }
        if (col == row){
            System.out.println();
            printTraingle(row-1,1);
        }
    }
}
