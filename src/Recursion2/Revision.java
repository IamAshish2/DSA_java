package Recursion2;

public class Revision {
    public static void main(String[] args) {
        System.out.println();
//        NTill1(5);
        printTillN(5);
    }

    static void NTill1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        NTill1(n-1);
    }

    static void printTillN(int n){
        if(n == 0){
            return;
        }
        printTillN(n -1 );
        System.out.println(n);
    }
}
