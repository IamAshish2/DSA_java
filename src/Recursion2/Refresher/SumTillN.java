package Recursion2.Refresher;

public class SumTillN {
    public static void main(String[] args) {
        System.out.println(sumTillN(5));
    }

    static int sumTillN(int num){
        if(num <= 1){
            return 1;
        }
        return num + sumTillN(num -1);
    }
}
