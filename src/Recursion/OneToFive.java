package Recursion;

public class OneToFive {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        // base case
        if (n == 1) {
            return;
        }

        System.out.println(n);
        // recursion
        print(n - 1);
    }

}
