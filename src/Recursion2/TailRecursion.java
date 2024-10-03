package Recursion2;

public class TailRecursion {
    public static void main(String[] args) {
        printNums(1);
    }

    static void printNums(int n){
        if(n==5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // this type of recursive function call is called tail recursion
        printNums(n+1);
    }
}
