package Recursion2.Refresher;

public class Product {
    public static void main(String[] args) {
        System.out.println(product(543));
        System.out.println(product(5050550));
    }

    static int product(int num){
        if (num % 10 == num){
            return num;
        }
        return (num % 10) * product(num / 10);
    }
}
