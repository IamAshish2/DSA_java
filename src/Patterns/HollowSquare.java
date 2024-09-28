package Patterns;
/*
20.    ****
       *  *
       *  *
       *  *
       ****

 */
public class HollowSquare {
    public static void main(String[] args) {
        hollowSquare(5);
    }

    static void hollowSquare(int n){
        for (int i=0;i<n;i++){
            for (int star=n;star>0;star--){
                if(i==0 || i==n-1 || star==1 || star==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
