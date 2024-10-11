package Recursion2.Refresher;

public class Fibonacci {
    public static void main(String[] args) {
//   fibonacci(8,0,1);
        System.out.println(nthFibo(4));
    }

    static void fibonacci(int n,int i,int j){
        if(n==0) return;
        System.out.println(i);
        int a = i;
        i = j;
        j = a;
        fibonacci(n-1,i+j,j);
    }

    static int nthFibo(int n){
        if(n < 2) return n;
        return nthFibo(n-1) + nthFibo(n-2);
    }

}
